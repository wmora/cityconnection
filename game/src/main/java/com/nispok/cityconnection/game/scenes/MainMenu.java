package com.nispok.cityconnection.game.scenes;

import java.util.HashMap;
import java.util.Map;

public class MainMenu extends Scene {

    private static final String PLAY_KEY = "play";

    private static Map<String, Class> options;

    public MainMenu() {
        super("Game title");
        options = new HashMap<String, Class>();
        options.put(PLAY_KEY, LevelSelect.class);
    }

    public Class getOption(String option) {
        return options.get(option);
    }

}
