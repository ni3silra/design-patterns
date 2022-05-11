package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Dice;
import com.lowleveldesign.snakeandladder.entity.Player;
import com.lowleveldesign.snakeandladder.logging.Logger;

import java.util.Map;
import java.util.Queue;

public class GamePlay {

    private final Queue<Player> playQueue;
    private final Map<String, Integer> players;
    private final Dice dice;
    private final GameBoard board;

    Logger logger = Logger.getInstance();

    public GamePlay(GameBoard board, Dice dice, Map<String, Integer> players, Queue<Player> playQueue) {
        this.playQueue = playQueue;
        this.dice = dice;
        this.players = players;
        this.board = board;
    }

    public void startGame() {

        logger.log("Game Started");

        while (!playQueue.isEmpty()) {
            Player currentPlayer = getCurrentPlayer();
            int currentPosition = players.get(currentPlayer.getName());
            int randomNumFromDice = dice.rollDice();
            int targetPosition = currentPosition + randomNumFromDice;

            if (board.isBoardEndedBeforePosition(targetPosition)) {
                addPlayersInQueue(currentPlayer, currentPosition);
                continue;
            }

            if (board.isWinningPosition(targetPosition)) {
                logger.log(currentPlayer.getName() + " won");
                break;
            }

            int nextPosition = board.getNextPosition(targetPosition, currentPlayer);

            addPlayersInQueue(currentPlayer, nextPosition);
        }

        logger.log("Game Ended");

    }

    private Player getCurrentPlayer() {
        return playQueue.poll();
    }

    private void addPlayersInQueue(Player currentPlayer, int nextPosition) {
        if (!board.isBoardEndedBeforePosition(nextPosition))
            logger.log(currentPlayer.getName() + " placed get to next Position :- " + nextPosition);
        else
            logger.log(currentPlayer.getName() + " No Movement for this time");

        playQueue.offer(currentPlayer);
        players.put(currentPlayer.getName(), nextPosition);
    }

}
