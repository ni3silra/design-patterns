package com.lowleveldesign.chess;

public class ChessApplication {
    Board board;
    Player[] players;
    Player currentPlayer;
    GameStatus gameStatus;

    public boolean playerMove(CellPosition from , CellPosition to, Piece piece){
        return false;
    }

    public boolean endGame(){
        return false;
    }

    private void changeTurn(){

    }

}
