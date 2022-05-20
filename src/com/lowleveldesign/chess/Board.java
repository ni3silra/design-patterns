package com.lowleveldesign.chess;

import java.util.List;

public abstract class Board {
    List<List<Cell>> board;

    public abstract void resetBoard();

    public abstract void updateBoard(Move move);
}
