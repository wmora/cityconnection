package com.nispok.cityconnection.game.scenes;

public abstract class Scene {

    protected String title;

    public Scene(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
