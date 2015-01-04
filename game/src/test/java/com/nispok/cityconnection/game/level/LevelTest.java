package com.nispok.cityconnection.game.level;

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

    public void testLevelShouldGoToPlayingStateAfterStarting() {
        Level level = new Level();
        level.start();
        assertEquals(LevelState.PLAYING, level.getState());
    }

    public void testLevelShouldGoToPausedStateAfterPausing() {
        Level level = new Level();
        level.pause();
        assertEquals(LevelState.PAUSED, level.getState());
    }

    public void testLevelShouldGoToPlayingStateAfterResuming() {
        Level level = new Level();
        level.resume();
        assertEquals(LevelState.PLAYING, level.getState());
    }

}
