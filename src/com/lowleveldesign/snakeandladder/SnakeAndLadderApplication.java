package com.lowleveldesign.snakeandladder;

import com.lowleveldesign.snakeandladder.businesslogic.GamePlay;
import com.lowleveldesign.snakeandladder.businesslogic.GameSettings;
import com.lowleveldesign.snakeandladder.businesslogic.PlayerSettings;
import com.lowleveldesign.snakeandladder.entity.*;
import com.lowleveldesign.snakeandladder.level.Level;

import java.util.List;

public class SnakeAndLadderApplication {

    private PlayerSettings playerSettings;

    public SnakeAndLadderApplication() {
        setGameSettings();
        setPlayerSettings();
    }

    private void setGameSettings() {
         GameSettings.setLevel(Level.EASY);
    }

    private void setPlayerSettings() {
        List<Player> playerList = List.of(new Player("Akshay Kumar", 0),
                new Player("Shah Rukh Khan", 0));
        playerSettings = new PlayerSettings(playerList);
    }

    private void start() {
        GamePlay gamePlay = new GamePlay(playerSettings);
        gamePlay.startGame();
    }

    public static void main(String[] args) {
        SnakeAndLadderApplication application = new SnakeAndLadderApplication();
        application.start();
    }

}
