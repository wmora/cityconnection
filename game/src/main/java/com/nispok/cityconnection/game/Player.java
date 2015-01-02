package com.nispok.cityconnection.game;

public class Player {

    private int oilCansLeft;
    private int livesLeft;
    private int mileage;

    public Player() {
        oilCansLeft = 5;
        livesLeft = 3;
        mileage = 0;
    }

    public int getOilCansLeft() {
        return oilCansLeft;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public int getMileage() {
        return mileage;
    }

    public void shoot() {
        oilCansLeft--;
    }
}
