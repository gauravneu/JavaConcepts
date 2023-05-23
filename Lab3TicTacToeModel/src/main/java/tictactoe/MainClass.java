package tictactoe;

public class MainClass {
    public static void main(String[] args) {
        TicTacToe t1 = new TicTacToeModel();

        t1.move(0, 0);
        t1.move(1, 2);
        t1.move(1, 1);
        t1.move(0, 2);
        t1.move(2, 2);
        System.out.println(t1.getWinner() + "Winner");
        System.out.println(t1.getMarkAt(1, 2));
        System.out.println(t1);
    }
}
