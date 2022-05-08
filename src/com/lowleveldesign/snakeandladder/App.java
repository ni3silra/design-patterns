package com.lowleveldesign.snakeandladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class App {

    private int boardSize;
    private Dice dice;
    private Map<String, Integer> players;
    private Queue<Player> playQueue;
    private List<Jumper> snakes;
    private List<Jumper> ladders;

    private App(){
        addDiceAndBoard();
        addSnakesAndLadders();
        addPlayers();
    }

    private void addDiceAndBoard(){
        boardSize = 100;
        dice = new Dice(1);
    }

    private void addSnakesAndLadders(){
        snakes = new ArrayList<>();
        snakes.add(new Jumper(15,3));
        snakes.add(new Jumper(26,12));
        snakes.add(new Jumper(99,2));

        ladders = new ArrayList<>();
        ladders.add(new Jumper(16,32));
        ladders.add(new Jumper(9,12));
        ladders.add(new Jumper(6,72));
        ladders.add(new Jumper(7,51));
    }

    private void addPlayers(){
        Player akshay = new Player(1,"Akshay Kumar");
        Player srk = new Player(2,"Shah Rukh Khan");

        players = new HashMap<>();
        players.put(akshay.getName(), 0);
        players.put(srk.getName(),0);

        playQueue = new LinkedList<>();
        playQueue.offer(akshay);
        playQueue.offer(srk);
    }

    public static void main(String[] args) {
        App app = new App();
        GameBoard board = new GameBoard(app.boardSize, app.dice,app.playQueue,app.snakes,app.ladders,app.players);
        board.startGame();
    }
}
