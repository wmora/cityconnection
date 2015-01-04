package com.nispok.cityconnection.game.level;

import com.nispok.cityconnection.game.characters.Car;

public class Level {
    private Car car;
    private LevelState state;

    public Level() {
        car = new Car();
        state = LevelState.READY;
    }

    public Car getCar() {
        return car;
    }

    public LevelState getState() {
        return state;
    }

    public void start() {
        state = LevelState.PLAYING;
    }

    public void pause() {
        state = LevelState.PAUSED;
    }

    public void resume() {
        state = LevelState.PLAYING;
    }
}
