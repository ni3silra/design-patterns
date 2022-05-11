package com.lowleveldesign.snakeandladder.entity;

public class Player {

    private final String name;
    private final int initialPosition;

    public Player(String name, int initialPosition) {
        this.name = name;
        this.initialPosition = initialPosition;
    }

    public String getName() {
        return name;
    }

    public int getInitialPosition() {
        return initialPosition;
    }
}
