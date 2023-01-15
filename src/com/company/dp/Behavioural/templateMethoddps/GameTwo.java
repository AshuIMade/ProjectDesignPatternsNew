package com.company.dp.Behavioural.templateMethoddps;

public abstract class GameTwo {
    protected final int numberOfPlayers;
    protected int currentPalyer;
    public GameTwo(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }
    //the skeleton algorithm
    public void run(){
        start();
        while (!haveWinners()){
            takeTurn();
        }
        System.out.println("Palyer "+ getWinningPlayer() + "wins");
    }
    public abstract void start();
    public abstract boolean haveWinners();
    public abstract void takeTurn();
    public abstract int getWinningPlayer();
}
