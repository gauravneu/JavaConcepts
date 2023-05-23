package tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeModelTest {

    public TicTacToeModel board;
    @Before
    public void TicTacToeModelTest(){
        board = new TicTacToeModel();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveRepeat() {
        board.move(0,0);
        board.move(0,0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testMoveOutOfBoard() {
        board.move(0,4);
    }

    @Test
    public void testGetTurn() {
        board.move(0,0);
        assertEquals(Player.O,board.getTurn());
    }

    @Test
    public void testIsGameOver() {
        board.move(0,0);
        assertFalse(board.isGameOver());
    }

    @Test
    public void testGetWinner() {
        board.move(0,0);
        board.move(0,2);
        board.move(1,1);
        board.move(2,0);
        board.move(2,2);
        assertEquals(Player.X, board.getWinner());
    }

    @Test
    public void testGetWinnerNull() {
        board.move(0,0);
        board.move(0,2);
        board.move(1,1);
        board.move(2,0);
        assertNull(board.getWinner());
    }


    @Test
    public void testGetMarkAt() {
        board.move(0,0);
        board.move(0,2);
        board.move(1,1);
        board.move(2,0);
        assertEquals(Player.X,board.getMarkAt(1,1));
    }

    @Test
    public void testGetMarkAtNull() {
        board.move(0,0);
        board.move(0,2);
        board.move(1,1);
        board.move(2,0);
        assertNull(board.getMarkAt(1,0));
    }
}