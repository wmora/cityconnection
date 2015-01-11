package com.nispok.cityconnection.game.characters;

public class Car {

    protected int speed;
    protected Direction direction;

    /**
     * @return current {@link com.nispok.cityconnection.game.characters.Direction}
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @return this {@link com.nispok.cityconnection.game.characters.Car}'s speed
     */
    public int getSpeed() {
        return speed;
    }

}
