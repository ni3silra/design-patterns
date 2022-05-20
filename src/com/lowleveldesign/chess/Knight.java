package com.lowleveldesign.chess;

import java.util.List;

public class Knight extends Piece{
    @Override
    public Move move(CellPosition from, CellPosition to) {
        return null;
    }

    @Override
    public boolean isValidMove(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<CellPosition> getAllValidMove(CellPosition currentPosition) {
        return null;
    }
}
