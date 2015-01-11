package com.nispok.cityconnection.game.characters;

public class Car {

    protected int speed;
    protected float mileage;
    protected Direction direction;

    public Car() {
        mileage = 0f;
    }

    /**
     * @return current mileage
     */
    public float getMileage() {
        return mileage;
    }

    /**
     * @return current {@link com.nispok.cityconnection.game.characters.Direction}
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Changes direction, from {@link com.nispok.cityconnection.game.characters.Direction#RIGHT} to
     * {@link com.nispok.cityconnection.game.characters.Direction#LEFT} and vice-versa
     */
    public void changeDirection() {
        direction = direction == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }

    /**
     * @return this {@link com.nispok.cityconnection.game.characters.Car}'s speed
     */
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
