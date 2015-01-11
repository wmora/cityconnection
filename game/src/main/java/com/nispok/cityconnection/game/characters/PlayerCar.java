package com.nispok.cityconnection.game.characters;

public class PlayerCar extends Car {

    private int oilCansLeft;

    public PlayerCar() {
        super();
        speed = 15;
        oilCansLeft = 5;
        direction = Direction.RIGHT;
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

}
