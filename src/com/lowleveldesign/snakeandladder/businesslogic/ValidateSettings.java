package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.logging.Logger;

public class ValidateSettings {

    private static final Logger logger = Logger.getInstance();

    private ValidateSettings() {
    }

    public static boolean validate() {
        if (!GameSettings.isInitialized()) {
            logger.logErr("Please set level in gameSettings before start Game Play");
            return false;
        }
        if (PlayerSettings.INSTANCE == null) {
            logger.logErr("Please add players in playerSetting before start Game Play");
            return false;
        }
        return true;
    }
}
