package com.lowleveldesign.chess;

import java.util.List;

public abstract class Piece {
    Color color;
    public abstract Move move(CellPosition from,CellPosition to);
    public abstract boolean isValidMove(CellPosition from,CellPosition to);
    public abstract List<CellPosition> getAllValidMove(CellPosition currentPosition);
}
