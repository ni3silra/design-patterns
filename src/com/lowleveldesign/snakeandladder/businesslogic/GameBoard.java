package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Jumper;
import com.lowleveldesign.snakeandladder.entity.Player;
import com.lowleveldesign.snakeandladder.logging.Logger;

import java.util.List;
import java.util.Optional;

public class GameBoard {

    int boardSize;
    private final List<Jumper> snakes;
    private final List<Jumper> ladders;

    Logger logger = Logger.getInstance();

    public GameBoard(int boardSize, List<Jumper> snakes, List<Jumper> ladders) {
        this.boardSize = boardSize;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    int getNextPosition(int targetPosition, Player currentPlayer) {

        int snakePosition = getPositionIfSnakePresent(targetPosition);
        if (snakePosition != -1) {
            logger.log(currentPlayer.getName() + " bitten by Snake ☺~ " + snakePosition);
            return snakePosition;
        }

        int ladderPosition = getPositionIfLadderPresent(targetPosition);
        if (ladderPosition != -1) {
            logger.log(currentPlayer.getName() + " Found a Ladder =▬= " + ladderPosition);
            return ladderPosition;
        }

        return targetPosition;
    }

    private int getPositionIfSnakePresent(int targetPosition) {
        Optional<Integer> snakePosition = snakes.stream()
                .filter(snake -> snake.getStartPoint() == targetPosition)
                .map(Jumper::getEndPoint)
                .findAny();
        return snakePosition.orElse(-1);
    }

    private int getPositionIfLadderPresent(int targetPosition) {
        Optional<Integer> ladderPosition = ladders.stream()
                .filter(ladder -> ladder.getStartPoint() == targetPosition)
                .map(Jumper::getEndPoint)
                .findAny();
        return ladderPosition.orElse(-1);
    }

    boolean isBoardEndedBeforePosition(int targetPosition) {
        return targetPosition > boardSize;
    }

    boolean isWinningPosition(int targetPosition) {
        return targetPosition == boardSize;
    }

}
