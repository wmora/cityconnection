package com.nispok.cityconnection.game.level;

import junit.framework.TestCase;

public class LevelStateTest extends TestCase {

    public void testThreeStatesShouldBeAvailable() {
        assertEquals(3, LevelState.values().length);
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

}
