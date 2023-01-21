package com.isvaso.observer.observablecodingexercise;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Game
{
    public Map<Integer, Rat> rats = new HashMap<>();
    private int count = 0;

    public void add(Rat rat) {
        rats.put(count++, rat);
        rat.gameId = count;
        notifyRats();
    }

    public void notifyRats() {
        rats.keySet().stream()
            .forEach(r -> {
                rats.get(r).attack = rats.size();
                System.out.println("Rat with id: "
                        + rats.get(r).gameId
                        + " have new Attack now: "
                        + rats.get(r).attack);
            });
    }
}

class Rat implements Closeable
{
    private Game game;
    public int gameId;
    public int attack = 1;

    public Rat(Game game)
    {
        game.add(this);
    }

    @Override
    public void close() throws IOException
    {
        if (game.rats.containsKey(gameId)) {
            game.rats.remove(gameId);
            game.notifyRats();
        }
        else
            throw new IOException();
    }
}


