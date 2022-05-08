package com.lowleveldesign.snakeandladder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    int boardSize;
    private final Dice dice;
    private final Queue<Player> playQueue;
    private final List<Jumper> snakes;
    private final List<Jumper> ladders;
    private final Map<String, Integer> players;

    public GameBoard(int boardSize, Dice dice, Queue<Player> playQueue, List<Jumper> snakes, List<Jumper> ladders, Map<String, Integer> players) {
        this.boardSize = boardSize;
        this.dice = dice;
        this.playQueue = playQueue;
        this.snakes = snakes;
        this.ladders = ladders;
        this.players = players;
    }

    public void startGame() {
        while (!playQueue.isEmpty()) {
            Player currentPlayer = getCurrentPlayer();
            int currentPosition = players.get(currentPlayer.getName());
            int randomNumFromDice = dice.rollDice();
            int targetPosition = currentPosition + randomNumFromDice;

            if (checkIfBoardEnded(targetPosition)) {
                addPlayersInQueue(currentPlayer, currentPosition);
                continue;
            }

            if (checkWin(targetPosition)) {
                System.out.println(currentPlayer.getName() + " won");
                break;
            }

            int nextPosition = getNextPosition(targetPosition, currentPlayer);

            if (checkWin(nextPosition)) {
                System.out.println(currentPlayer.getName() + " won");
                break;
            }

            addPlayersInQueue(currentPlayer, nextPosition);
        }
    }

    private Player getCurrentPlayer() {
        return playQueue.poll();
    }

    private boolean checkIfBoardEnded(int targetPosition) {
        return targetPosition > boardSize;
    }

    private boolean checkWin(int targetPosition) {
        return targetPosition == boardSize;
    }

    private int getNextPosition(int targetPosition, Player currentPlayer) {

        int snakePosition = checkIfSnake(targetPosition);
        if (snakePosition != -1) {
            System.out.println("================================================");
            System.out.println(currentPlayer.getName() + " bitten by Snake ☺~ " + snakePosition);
            System.out.println("================================================");
            return snakePosition;
        }

        int ladderPosition = checkIfLadder(targetPosition);
        if (ladderPosition != -1) {
            System.out.println("=================================================");
            System.out.println(currentPlayer.getName() + " Found a Ladder =▬= " + ladderPosition);
            System.out.println("================================================");
            return ladderPosition;
        }

        System.out.println(currentPlayer.getName() + " Just get to next Position " + targetPosition);

        return targetPosition;
    }

    private int checkIfSnake(int targetPosition) {
        for (Jumper snake : snakes)
            if (snake.getStartPoint() == targetPosition)
                return snake.getEndPoint();
        return -1;
    }

    private int checkIfLadder(int targetPosition) {
        for (Jumper ladder : ladders)
            if (ladder.getStartPoint() == targetPosition)
                return ladder.getEndPoint();
        return -1;
    }

    private void addPlayersInQueue(Player currentPlayer, int nextPosition) {
        playQueue.offer(currentPlayer);
        players.put(currentPlayer.getName(), nextPosition);
    }
}
