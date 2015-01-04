package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.enums.Direction;

public class Player {

    private int oilCansLeft;
    private int livesLeft;
    private int mileage;
    private Direction direction;

    public Player() {
        oilCansLeft = 5;
        livesLeft = 3;
        mileage = 0;
        direction = Direction.RIGHT;
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

    public void crash() {
        livesLeft--;
    }

    public Direction getDirection() {
        return direction;
    }

    public void changeDirection() {
        direction = direction == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }
}
