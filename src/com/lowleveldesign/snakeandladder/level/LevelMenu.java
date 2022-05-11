package com.lowleveldesign.snakeandladder.level;

import com.lowleveldesign.snakeandladder.logging.Logger;

public class LevelMenu {

    static Logger logger = Logger.getInstance();

    private LevelMenu() {
    }

    public static LevelStrategy getLevel(Level level) {
        logger.log("Level set to :- " + level.getName());
        return switch (level) {
            case EASY -> new EasyLevelStrategy();
            case MEDIUM -> new MediumLevelStrategy();
            case HARD -> new HardLevelStrategy();
        };
    }
}
