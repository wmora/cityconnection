package com.nispok.cityconnection.game.scenes;

import junit.framework.TestCase;

public class MainMenuTest extends TestCase {

    public void testMainMenuShouldHaveATitle() {
        MainMenu mainMenu = new MainMenu();
        assertNotNull(mainMenu.getTitle());
    }

    public void testMainMenuShouldHaveOptionToPlay() {
        MainMenu mainMenu = new MainMenu();
        assertNotNull(mainMenu.getOption("play"));
    }

    public void testMainMenuShouldGoToLevelSelectIfPlayOptionSelected() {
        MainMenu mainMenu = new MainMenu();
        assertEquals(LevelSelect.class, mainMenu.getOption("play"));
    }

}
