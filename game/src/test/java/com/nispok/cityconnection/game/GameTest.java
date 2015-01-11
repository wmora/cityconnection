package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.scenes.MainMenu;
import junit.framework.TestCase;

public class GameTest extends TestCase {

    public void testGameShouldHaveAScene() {
        Game game = new Game();
        assertNotNull(game.getScene());
    }

    public void testGameFirstSceneShouldBeMainMenu() {
        Game game = new Game();
        assertEquals(MainMenu.class, game.getScene().getClass());
    }

}
