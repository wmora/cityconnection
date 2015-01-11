package com.nispok.cityconnection.game.characters;

public class PlayerCar extends Car {

    public PlayerCar() {
        speed = 15;
        oilCansLeft = 5;
        mileage = 0;
        direction = Direction.RIGHT;
    }

    public void shoot() {
        oilCansLeft--;
    }

}
