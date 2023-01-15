package com.company.dp.Behavioural.templateMethoddps;

public abstract class Game {
    protected int currentPlayer;
    protected final int numberOfPlayers;

    public Game(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }
    //skeleton algorithm
    public void run(){
        start();
        while (!haveWinner()){
            takeTurn();
        }
        System.out.println("Player " + getWinningPlayer() +" wins!");
    }
    //details are left for subclass to implement them
    protected abstract void start();
    protected abstract boolean haveWinner();
    protected abstract void takeTurn();
    protected abstract int getWinningPlayer();

}
