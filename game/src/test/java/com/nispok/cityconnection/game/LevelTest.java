package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.level.Level;
import com.nispok.cityconnection.game.level.LevelState;
import junit.framework.TestCase;

public class LevelTest extends TestCase {

    public void testLevelShouldStartWithACar() {
        Level level = new Level();
        assertNotNull(level.getCar());
    }

    public void testLevelShouldStartWithAState() {
        Level level = new Level();
        assertNotNull(level.getState());
    }

    public void testLevelShouldStartInReadyState() {
        Level level = new Level();
        assertEquals(LevelState.READY, level.getState());
    }

}
