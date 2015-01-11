package com.nispok.cityconnection.game;

import junit.framework.TestCase;

public class LevelStateTest extends TestCase {

    public void testFourStatesShouldBeAvailable() {
        assertEquals(4, LevelState.values().length);
    }

    public void testValueOfReadyStateShouldBeReady() {
        assertEquals(LevelState.READY, LevelState.valueOf("READY"));
    }

    public void testValueOfPlayingStateShouldBePlaying() {
        assertEquals(LevelState.PLAYING, LevelState.valueOf("PLAYING"));
    }

    public void testValueOfPausedStateShouldBePaused() {
        assertEquals(LevelState.PAUSED, LevelState.valueOf("PAUSED"));
    }

    public void testValueOfOverStateShouldBeOver() {
        assertEquals(LevelState.OVER, LevelState.valueOf("OVER"));
    }

}
