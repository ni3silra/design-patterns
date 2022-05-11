package com.lowleveldesign.snakeandladder.level;

import com.lowleveldesign.snakeandladder.entity.Dice;
import com.lowleveldesign.snakeandladder.entity.Jumper;
import com.lowleveldesign.snakeandladder.entity.Ladder;
import com.lowleveldesign.snakeandladder.entity.Snake;

import java.util.ArrayList;
import java.util.List;

public class MediumLevelStrategy implements LevelStrategy {

    @Override
    public int getBoardSize() {
        return 250;
    }

    @Override
    public Dice getDice() {
        return new Dice(2);
    }

    @Override
    public List<Jumper> prepareLadders() {
        List<Jumper> jumpers = new ArrayList<>();
        jumpers.add(new Ladder(16, 32));
        jumpers.add(new Ladder(9, 12));
        jumpers.add(new Ladder(6, 72));
        jumpers.add(new Ladder(7, 51));
        return jumpers;
    }

    @Override
    public List<Jumper> prepareSnakes() {
        List<Jumper> jumpers = new ArrayList<>();
        jumpers.add(new Snake(15, 3));
        jumpers.add(new Snake(26, 12));
        jumpers.add(new Snake(99, 2));
        return jumpers;
    }

}
