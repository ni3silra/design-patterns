package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Dice;
import com.lowleveldesign.snakeandladder.entity.Jumper;
import com.lowleveldesign.snakeandladder.entity.Player;
import com.lowleveldesign.snakeandladder.logging.Logger;

import java.util.List;
import java.util.Optional;

public class GameBoardUtility {

    private static int boardSize;
    private static Dice dice;
    private static List<Jumper> snakes;
    private static List<Jumper> ladders;

    static Logger logger = Logger.getInstance();

    private GameBoardUtility(){
    }

    public static void createBoard(int boardSize,Dice dice, List<Jumper> snakes, List<Jumper> ladders) {
        GameBoardUtility.boardSize = boardSize;
        GameBoardUtility.dice = dice;
        GameBoardUtility.snakes = snakes;
        GameBoardUtility.ladders = ladders;
    }

    static int getNextPosition(int targetPosition, Player currentPlayer) {

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

    private static int getPositionIfSnakePresent(int targetPosition) {
        Optional<Integer> snakePosition = snakes.stream()
                .filter(snake -> snake.getStartPoint() == targetPosition)
                .map(Jumper::getEndPoint)
                .findAny();
        return snakePosition.orElse(-1);
    }

    private static int getPositionIfLadderPresent(int targetPosition) {
        Optional<Integer> ladderPosition = ladders.stream()
                .filter(ladder -> ladder.getStartPoint() == targetPosition)
                .map(Jumper::getEndPoint)
                .findAny();
        return ladderPosition.orElse(-1);
    }

    static boolean isBoardEndedBeforePosition(int targetPosition) {
        return targetPosition > boardSize;
    }

    static boolean isWinningPosition(int targetPosition) {
        return targetPosition == boardSize;
    }

    static int rollDice(){
        return dice.rollDice();
    }
}
