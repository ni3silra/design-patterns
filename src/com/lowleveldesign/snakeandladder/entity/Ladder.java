package com.lowleveldesign.snakeandladder.entity;

public final class Ladder implements Jumper {

    int firstStep;
    int lastStep;

    public Ladder(int firstStep, int lastStep) {
        if (lastStep < firstStep)
            throw new IllegalArgumentException("first step can't be greater then last step in ladder");
        this.firstStep = firstStep;
        this.lastStep = lastStep;
    }

    @Override
    public int getStartPoint() {
        return firstStep;
    }

    @Override
    public int getEndPoint() {
        return lastStep;
    }
}
