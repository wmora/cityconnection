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
