package com.nispok.cityconnection.game.city;

import com.nispok.cityconnection.game.characters.Car;

public class City {
    private Car car;
    private CityState state;

    public City() {
        car = new Car();
        state = CityState.READY;
    }

    public Car getCar() {
        return car;
    }

    public CityState getState() {
        return state;
    }

    public void start() {
        state = CityState.PLAYING;
    }

    public void pause() {
        state = CityState.PAUSED;
    }

    public void resume() {
        state = CityState.PLAYING;
    }

    public void finish() {
        state = CityState.OVER;
    }
}
