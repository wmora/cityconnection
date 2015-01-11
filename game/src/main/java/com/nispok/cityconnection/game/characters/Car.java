package com.nispok.cityconnection.game.characters;

public class Car {

    private final int speed = 15;

    private int oilCansLeft;
    private float mileage;
    private Direction direction;

    public Car() {
        oilCansLeft = 5;
        mileage = 0;
        direction = Direction.RIGHT;
    }

    public int getOilCansLeft() {
        return oilCansLeft;
    }

    public float getMileage() {
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

    public int getSpeed() {
        return speed;
    }

    /**
     * Updates de {@link com.nispok.cityconnection.game.characters.Car} mileage given the time passed since the last
     * update. Note that mileage is always incremented, even with a negative delta
     *
     * @param delta time passed, in seconds, since the last mileage update
     */
    public void updateMileage(float delta) {
        mileage += speed * Math.abs(delta);
    }
}
