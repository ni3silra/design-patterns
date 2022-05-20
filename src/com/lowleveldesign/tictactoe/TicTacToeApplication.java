package com.lowleveldesign.tictactoe;

public class TicTacToeApplication {
    public static void main(String[] args) {
        play(BoardUtility.initiate(2, 1, 2));
    }

    public static void play(BoardUtility boardUtility) {
        boardUtility.move(1, 0, 0);
        boardUtility.move(2, 0, 1);
        boardUtility.move(1, 1, 0);
        boardUtility.move(2, 1, 1);
        System.out.println(boardUtility.getWinner());
    }
}
