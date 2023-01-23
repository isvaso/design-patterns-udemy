package com.isvaso.templatemethod.templatemethod;

// template
abstract class Game {

    protected int currentPlayer;
    protected final int numberOfPlayer;

    public Game(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void run() {
        start();
        while (!haveWinner())
            takeTurn();
        System.out.println("Player " + getWinningPlayer() + " wins");
    }

    // template methods
    protected abstract int getWinningPlayer();
    protected abstract void takeTurn();
    protected abstract boolean haveWinner();
    protected abstract void start();
}
