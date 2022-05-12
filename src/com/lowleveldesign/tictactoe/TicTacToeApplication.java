package com.lowleveldesign.tictactoe;

public class TicTacToeApplication {
    public static void main(String[] args) {
        BoardUtility boardUtility = BoardUtility.initiate(2, 2, -1);
        play(boardUtility);
    }

    public static void play(BoardUtility boardUtility) {
        boardUtility.move(2, 0, 0);
        boardUtility.move(-1, 0, 1);
        boardUtility.move(2, 1,0 );
        System.out.println(boardUtility.getWinner());
    }
}
