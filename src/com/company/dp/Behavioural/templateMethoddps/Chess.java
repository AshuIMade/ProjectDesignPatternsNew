package com.company.dp.Behavioural.templateMethoddps;

public class Chess extends GameTwo{
    private int maxTurn=10;
    private int turn=1;
    public Chess(){
        super(2);
    }
    @Override
    public void start() {
        System.out.println("Starting Game Of Chess...");
    }

    @Override
    public boolean haveWinners() {
        return turn == maxTurn;
    }

    @Override
    public void takeTurn() {
        System.out.println("Turn " + (turn++) + "taken by player" +currentPalyer);
        currentPalyer=(currentPalyer+1)%numberOfPlayers;
    }

    @Override
    public int getWinningPlayer() {
        return 0;
    }
}
