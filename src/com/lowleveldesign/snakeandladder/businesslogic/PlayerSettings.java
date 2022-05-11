package com.lowleveldesign.snakeandladder.businesslogic;

import com.lowleveldesign.snakeandladder.entity.Player;

import java.util.*;

public class PlayerSettings {
    private final Map<String, Integer> players;
    private final Queue<Player> playQueue;

    public PlayerSettings(List<Player> playerList) {
        players = new HashMap<>();
        playQueue = new LinkedList<>();
        addPlayers(playerList);
    }

    private void addPlayers(List<Player> playerList) {
        for (Player player : playerList) {
            players.put(player.getName(), player.getInitialPosition());
            playQueue.offer(player);
        }
    }

    public Map<String, Integer> getPlayers() {
        return players;
    }

    public Queue<Player> getPlayQueue() {
        return playQueue;
    }

}
