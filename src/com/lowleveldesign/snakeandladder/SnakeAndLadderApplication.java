package com.lowleveldesign.snakeandladder;

import com.lowleveldesign.snakeandladder.businesslogic.*;
import com.lowleveldesign.snakeandladder.entity.*;
import com.lowleveldesign.snakeandladder.level.Level;

import java.util.List;

public class SnakeAndLadderApplication {
    public static void main(String[] args) {
        List<Player> playerList = List.of(
                new Player("Ajay Devgan", 0),
                new Player("Shah Rukh Khan", 0),
                new Player("Akshay Kumar", 0));

        GameSettings.setLevel(Level.MEDIUM);
        PlayerSettings.addPlayers(playerList);
        GamePlay.start();
    }
}
