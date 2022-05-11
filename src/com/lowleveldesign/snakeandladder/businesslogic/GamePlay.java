package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Player;
import com.lowleveldesign.snakeandladder.logging.Logger;

import java.util.Map;
import java.util.Queue;

import static com.lowleveldesign.snakeandladder.businesslogic.GameBoardUtility.*;

public class GamePlay {

    private final Map<String, Integer> players;
    private final Queue<Player> playQueue;

    Logger logger = Logger.getInstance();

    public GamePlay( PlayerSettings playerSettings) {
        this.players = playerSettings.getPlayers();
        this.playQueue = playerSettings.getPlayQueue();
    }

    public void startGame() {

        logger.log("Game Started");

        while (!playQueue.isEmpty()) {
            Player currentPlayer = getCurrentPlayer();
            int currentPosition = players.get(currentPlayer.getName());
            int randomNumFromDice = rollDice();
            int targetPosition = currentPosition + randomNumFromDice;

            if (isBoardEndedBeforePosition(targetPosition)) {
                addPlayersInQueue(currentPlayer, currentPosition);
                continue;
            }

            if (isWinningPosition(targetPosition)) {
                logger.log(currentPlayer.getName() + " won");
                break;
            }

            int nextPosition = getNextPosition(targetPosition, currentPlayer);

            addPlayersInQueue(currentPlayer, nextPosition);
        }

        logger.log("Game Ended");

    }

    private Player getCurrentPlayer() {
        return playQueue.poll();
    }

    private void addPlayersInQueue(Player currentPlayer, int nextPosition) {
        if (!isBoardEndedBeforePosition(nextPosition))
            logger.log(currentPlayer.getName() + " placed get to next Position :- " + nextPosition);
        else
            logger.log(currentPlayer.getName() + " No Movement for this time");

        playQueue.offer(currentPlayer);
        players.put(currentPlayer.getName(), nextPosition);
    }

}
