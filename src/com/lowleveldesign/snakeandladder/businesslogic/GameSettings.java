package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Dice;
import com.lowleveldesign.snakeandladder.entity.Jumper;
import com.lowleveldesign.snakeandladder.level.Level;
import com.lowleveldesign.snakeandladder.level.LevelMenu;
import com.lowleveldesign.snakeandladder.level.LevelStrategy;

import java.util.List;

public class GameSettings {

    LevelStrategy levelStrategy;

    private GameSettings(Level level){
        levelStrategy = LevelMenu.getLevel(level);
        prepareBoard();
    }

    public static void setLevel(Level level){
        new GameSettings(level);
    }

    private void prepareBoard(){

        int boardSize = levelStrategy.getBoardSize();
        Dice dice = levelStrategy.getDice();
        List<Jumper> snakes = levelStrategy.prepareSnakes();
        List<Jumper> ladders = levelStrategy.prepareLadders();

        GameBoardUtility.createBoard(boardSize, dice, snakes, ladders);
    }
}
