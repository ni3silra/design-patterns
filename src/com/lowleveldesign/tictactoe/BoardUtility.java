package com.lowleveldesign.tictactoe;

import static java.lang.Math.abs;

public class BoardUtility {

    int[] rowSum;
    int[] colSum;
    int diagSum = 0;
    int revDiagSum = 0;
    int winner;
    int[][] board;

    private BoardUtility(int size) {
        board = new int[size][size];
        rowSum = new int[size];
        colSum = new int[size];
    }

    public static BoardUtility initiate(int size, int player1, int player2) {
        if (player1 == 0 || player2 == 0)
            throw new IllegalArgumentException("Player can not be 0");
        return new BoardUtility(size);
    }

    public void move(int player, int row, int col) {

        int n = board.length;

        if (row < 0 || col < 0 || row > n || col > n)
            throw new IllegalArgumentException("indexes are out of bound..");
        if (board[row][col] != 0)
            throw new IllegalArgumentException("player already exists in cell...");
        if (player == 0)
            throw new IllegalArgumentException("player is not valid...");

        board[row][col] = player;
        rowSum[row] += player;
        colSum[col] += player;

        if (row == col)
            diagSum += player;
        if (row == n - 1 - col)
            revDiagSum += player;

        int chk = abs(n);

        if (rowSum[row] == chk || colSum[col] == chk || diagSum == chk || revDiagSum == chk)
            winner = player;

    }

    public int getWinner() {
        return winner;
    }
}
