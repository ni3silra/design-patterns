package com.lowleveldesign.snakeandladder;

import com.lowleveldesign.snakeandladder.businesslogic.GamePlay;
import com.lowleveldesign.snakeandladder.businesslogic.GameSettings;
import com.lowleveldesign.snakeandladder.businesslogic.PlayerSettings;
import com.lowleveldesign.snakeandladder.entity.*;
import com.lowleveldesign.snakeandladder.level.Level;

import java.util.List;

public class SnakeAndLadderApplication {

    public SnakeAndLadderApplication() {
        GameSettings.setLevel(Level.EASY);
        setPlayerSettings();
    }

    private void setPlayerSettings() {
        List<Player> playerList = List.of(
                new Player("Akshay Kumar", 0),
                new Player("Shah Rukh Khan", 0));

        PlayerSettings.addPlayers(playerList);
    }

    private void start() {
        GamePlay.start();
    }

    public static void main(String[] args) {
        SnakeAndLadderApplication application = new SnakeAndLadderApplication();
        application.start();
    }

}
