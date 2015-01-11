package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.city.City;

public class Level {

    private City city;
    private LevelState state;

    public Level() {
        city = new City();
        state = LevelState.READY;
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

    public void finish() {
        state = LevelState.OVER;
    }

    public City getCity() {
        return city;
    }
}
