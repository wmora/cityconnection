package com.nispok.cityconnection.game.characters;

public class PlayerCar extends Car {

    private int oilCansLeft;
    private float mileage;

    public PlayerCar() {
        super();
        speed = 15;
        oilCansLeft = 5;
        direction = Direction.RIGHT;
    }

    /**
     * @return current mileage
     */
    public float getMileage() {
        return mileage;
    }

    /**
     * Changes direction, from {@link com.nispok.cityconnection.game.characters.Direction#RIGHT} to
     * {@link com.nispok.cityconnection.game.characters.Direction#LEFT} and vice-versa
     */
    public void changeDirection() {
        direction = direction == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }

    /**
     * @return number of oil cans left
     */
    public int getOilCansLeft() {
        return oilCansLeft;
    }

    /**
     * Shoots an oil can
     */
    public void shoot() {
        if (oilCansLeft > 0) {
            oilCansLeft--;
        }
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
