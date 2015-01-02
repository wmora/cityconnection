package com.nispok.cityconnection.game;

public class Player {

    private int oilCansLeft;
    private int livesLeft;

    public Player() {
        oilCansLeft = 5;
        livesLeft = 3;
    }

    public int getOilCansLeft() {
        return oilCansLeft;
    }

    public int getLivesLeft() {
        return livesLeft;
    }
}
