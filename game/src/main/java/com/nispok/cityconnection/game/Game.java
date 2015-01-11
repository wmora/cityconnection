package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.scenes.MainMenu;
import com.nispok.cityconnection.game.scenes.Scene;

/**
 * A {@link com.nispok.cityconnection.game.scenes.Scene} manager
 */
public class Game {

    private Scene scene;

    public Game() {
        scene = new MainMenu();
    }

    /**
     * @return the current {@link com.nispok.cityconnection.game.scenes.Scene}
     */
    public Scene getScene() {
        return scene;
    }
}
