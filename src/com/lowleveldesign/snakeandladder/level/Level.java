package com.lowleveldesign.snakeandladder.level;

public enum Level {
    EASY(1, "Easy"),
    MEDIUM(2, "Medium"),
    HARD(3, "Hard");

    int id;
    String name;

    Level(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
