package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Dice;
import com.lowleveldesign.snakeandladder.entity.Jumper;
import com.lowleveldesign.snakeandladder.level.Level;
import com.lowleveldesign.snakeandladder.level.LevelMenu;
import com.lowleveldesign.snakeandladder.level.LevelStrategy;

import java.util.List;

public class GameSettings {

    private GameSettings() {
    }

    public static void setLevel(Level level) {
        LevelStrategy levelStrategy = LevelMenu.getLevel(level);

        int boardSize = levelStrategy.getBoardSize();
        Dice dice = levelStrategy.getDice();
        List<Jumper> snakes = levelStrategy.prepareSnakes();
        List<Jumper> ladders = levelStrategy.prepareLadders();

        GameBoardUtility.createBoard(boardSize, dice, snakes, ladders);
    }

}
