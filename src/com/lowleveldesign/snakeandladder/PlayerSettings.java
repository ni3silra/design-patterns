package com.lowleveldesign.snakeandladder;

import com.lowleveldesign.snakeandladder.entity.Player;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PlayerSettings {
    private Map<String, Integer> players;
    private Queue<Player> playQueue;

    public void setPlayerInGame() {

        Player akshay = new Player(1, "Akshay Kumar");
        Player srk = new Player(2, "Shah Rukh Khan");

        Map<String, Integer> players = new HashMap<>();
        players.put(akshay.getName(), 0);
        players.put(srk.getName(), 0);
        setPlayers(players);

        Queue<Player> playQueue = new LinkedList<>();
        playQueue.offer(akshay);
        playQueue.offer(srk);
        setPlayQueue(playQueue);
    }

    public Map<String, Integer> getPlayers() {
        return players;
    }

    private void setPlayers(Map<String, Integer> players) {
        this.players = players;
    }

    public Queue<Player> getPlayQueue() {
        return playQueue;
    }

    private void setPlayQueue(Queue<Player> playQueue) {
        this.playQueue = playQueue;
    }
}
