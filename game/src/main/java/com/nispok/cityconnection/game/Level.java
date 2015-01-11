package com.nispok.cityconnection.game;

public class Level {

    private LevelState state;

    public Level() {
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
}
