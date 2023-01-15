package com.company.dp.Behavioural.templateMethoddps;

public class Chase extends Game{
    private int maxTurns=10;
    private int turn=1;

    public Chase(){
        super(2);
    }
    @Override
    protected void start() {
        System.out.println("Starting a game of chess");
    }

    @Override
    protected boolean haveWinner() {
        return turn==maxTurns;
    }

    @Override
    protected void takeTurn() {
        System.out.println("Turn " + (turn++) + " taken by player " + currentPlayer);
        currentPlayer = (currentPlayer+1)% numberOfPlayers;
    }

    @Override
    protected int getWinningPlayer() {
        return 0;
    }
}
