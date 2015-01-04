package com.nispok.cityconnection.game.level;

import com.nispok.cityconnection.game.Car;

public class Level {
    private Car car;

    public Level() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }
}
