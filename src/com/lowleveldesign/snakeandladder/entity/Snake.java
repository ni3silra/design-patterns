package com.lowleveldesign.snakeandladder.entity;

public final class Snake implements Jumper {

    int head;
    int tail;

    public Snake(int head, int tail) {
        if (head < tail)
            throw new IllegalArgumentException("tail can't be greater then head in Snake");
        this.head = head;
        this.tail = tail;
    }

    @Override
    public int getStartPoint() {
        return head;
    }

    @Override
    public int getEndPoint() {
        return tail;
    }
}
