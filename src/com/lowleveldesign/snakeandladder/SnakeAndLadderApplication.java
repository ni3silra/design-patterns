package com.lowleveldesign.snakeandladder;

import com.lowleveldesign.snakeandladder.businesslogic.GameBoard;
import com.lowleveldesign.snakeandladder.businesslogic.GamePlay;
import com.lowleveldesign.snakeandladder.entity.*;
import com.lowleveldesign.snakeandladder.level.Level;
import com.lowleveldesign.snakeandladder.level.LevelMenu;
import com.lowleveldesign.snakeandladder.level.LevelStrategy;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class SnakeAndLadderApplication {

    public static void main(String[] args) {

        LevelMenu menu = LevelMenu.getInstance();
        LevelStrategy level = menu.getLevel(Level.EASY);

        int boardSize = level.getBoardSize();
        Dice dice = level.getDice();
        List<Jumper> snakes = level.prepareSnakes();
        List<Jumper> ladders = level.prepareLadders();

        GameBoard board = new GameBoard(boardSize, snakes, ladders);

        PlayerSettings playerSettings = new PlayerSettings();
        playerSettings.setPlayerInGame();

        Map<String, Integer> players = playerSettings.getPlayers();
        Queue<Player> playerQueue = playerSettings.getPlayQueue();

        GamePlay gamePlay = new GamePlay(board, dice, players, playerQueue);

        gamePlay.startGame();
    }

}
