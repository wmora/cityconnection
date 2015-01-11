package com.nispok.cityconnection.game;

import junit.framework.TestCase;

public class LevelTest extends TestCase {

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

    public void testLevelShouldGoToOverStateAfterFinishing() {
        Level level = new Level();
        level.finish();
        assertEquals(LevelState.OVER, level.getState());
    }

}
