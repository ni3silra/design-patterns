package com.lowleveldesign.snakeandladder.entity;

public class Dice {
    int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int rollDice() {
        int upperBound = 6 * numberOfDice;
        int lowerBound = numberOfDice;
        return (int) (Math.random() * ((upperBound - lowerBound) + 1));
    }
}
