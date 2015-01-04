package com.nispok.cityconnection.game.characters;

public class Car {

    private int oilCansLeft;
    private int mileage;
    private Direction direction;

    public Car() {
        oilCansLeft = 5;
        mileage = 0;
        direction = Direction.RIGHT;
    }

    public int getOilCansLeft() {
        return oilCansLeft;
    }

    public int getMileage() {
        return mileage;
    }

    public void shoot() {
        oilCansLeft--;
    }

    public Direction getDirection() {
        return direction;
    }

    public void changeDirection() {
        direction = direction == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }
}
