package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.level.Level;
import junit.framework.TestCase;

public class LevelTest extends TestCase {

    public void testLevelShouldStartWithACar() {
        Level level = new Level();
        assertNotNull(level.getCar());
    }

    public void testLevelShouldHaveAState() {

    }

}
