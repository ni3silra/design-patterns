package com.lowleveldesign.snakeandladder.businesslogic;

public class ValidateSettings {

    private ValidateSettings(){
    }

    public static boolean validate(){
        if(!GameSettings.isInitialized())
            throw new RuntimeException("Please set  level in gameSettings before start Game Play");

        if(PlayerSettings.settings == null)
            throw new RuntimeException("Please add  players in playerSetting before start Game Play");
        return true;
    }
}
