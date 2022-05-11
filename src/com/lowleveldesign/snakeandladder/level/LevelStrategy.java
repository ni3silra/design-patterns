package com.lowleveldesign.snakeandladder.level;

import com.lowleveldesign.snakeandladder.entity.Dice;
import com.lowleveldesign.snakeandladder.entity.Jumper;

import java.util.List;

public interface LevelStrategy {

    int getBoardSize();

    Dice getDice();

    List<Jumper> prepareSnakes();

    List<Jumper> prepareLadders();

    default Dice createCustomNumOfDice(int numberOfDice) {
        return new Dice(numberOfDice);
    }

    default int createCustomBoard(int boardSize) {
        return boardSize;
    }
}
