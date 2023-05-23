package tictactoe;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TicTacToeModel implements TicTacToe {

    // add your implementation here
    Player[][] board;
    //keeping the count to check which player to make a next move
    private int count;

    public TicTacToeModel() {
        board = new Player[3][3];
        count = 0;
    }


    @Override
    public String toString() {
        // Using Java stream API to save code:
        return Arrays.stream(getBoard()).map(
                        row -> " " + Arrays.stream(row).map(
                                p -> p == null ? " " : p.toString()).collect(Collectors.joining(" | ")))
                .collect(Collectors.joining("\n-----------\n"));
        // This is the equivalent code as above, but using iteration, and still using the helpful
        // built-in String.join method.
        // List<String> rows = new ArrayList<>();
        // for(Player[] row : getBoard()) {
        //   List<String> rowStrings = new ArrayList<>();
        //   for(Player p : row) {
        //     if(p == null) {
        //       rowStrings.add(" ");
        //     } else {
        //       rowStrings.add(p.toString());
        //     }
        //   }
        //   rows.add(" " + String.join(" | ", rowStrings));
        // }
        // return String.join("\n-----------\n", rows);
    }


    @Override
    public void move(int r, int c) throws IllegalArgumentException, IllegalStateException {
//Checking if game is over or if selected point is available to move before making a move
        if (isGameOver()) throw new IllegalStateException();

        if (r < 0 || r > 2 || c < 0 || c > 2) {
            throw new IllegalArgumentException();
        }

        Player a = getMarkAt(r, c);
        if (a != null) throw new IllegalArgumentException();

        //getting X or O as next player to make a move
        Player markNext = getTurn();
        board[r][c] = markNext;
        count++;
    }


    @Override
    public Player getTurn() {
        if (count % 2 != 0) {
            return Player.O;
        }
        return Player.X;
    }


    @Override
    public boolean isGameOver() {
        //no one can win game before 5 moves are made
        if (count < 5) return false;
            //if 9 moves are made, game is already over
        else if (count == 9) return true;
        else return getWinner() != null;
    }


    @Override
    public Player getWinner() {
        if (count < 5) {
            return null;
        } else {
            Player x = null;
            for (int i = 0; i < 3; i++) {
                x = isSameInRow(i);
                if (x != null) return x;
            }
            for (int i = 0; i < 3; i++) {
                x = isSameInColumn(i);
                if (x != null) return x;
            }
            x = isDiagonalOne();
            if (x != null) return x;
            x = isDiagonalTwo();
            if (x != null) return x;
            return x;
        }
    }


    @Override
    public Player[][] getBoard() {
        return board;
    }


    @Override
    public Player getMarkAt(int r, int c) {
        return this.board[r][c];
    }


    public Player isSameInRow(int r) {
        if (getMarkAt(r, 0) == null) return null;
        else {
            if (getMarkAt(r, 0).equals(getMarkAt(r, 1))
                    && getMarkAt(r, 1).equals(getMarkAt(r, 2)))
                return getMarkAt(r, 0);
            return null;
        }
    }


    public Player isSameInColumn(int c) {
        if (getMarkAt(0, c) == null) return null;
        else {
            if (getMarkAt(0, c).equals(getMarkAt(1, c))
                    && getMarkAt(1, c).equals(getMarkAt(2, c)))
                return getMarkAt(0, c);
            return null;
        }
    }


    public Player isDiagonalOne() {
        if (getMarkAt(0, 0) == null) {
            return null;
        } else {
            if (getMarkAt(0, 0).equals(getMarkAt(1, 1))
                    &&
                    getMarkAt(1, 1).equals(getMarkAt(2, 2))) {
                return getMarkAt(0, 0);
            }
            return null;
        }
    }


    public Player isDiagonalTwo() {
        if (getMarkAt(0, 2) == null) {
            return null;
        } else {
            if (getMarkAt(0, 2).equals(getMarkAt(1, 1))
                    &&
                    getMarkAt(1, 1).equals(getMarkAt(2, 0))) {
                return getMarkAt(2, 0);
            }
            return null;
        }
    }
}
