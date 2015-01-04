package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class CityStateTest extends TestCase {

    public void testFourStatesShouldBeAvailable() {
        assertEquals(4, CityState.values().length);
    }

    public void testValueOfReadyStateShouldBeReady() {
        assertEquals(CityState.READY, CityState.valueOf("READY"));
    }

    public void testValueOfPlayingStateShouldBePlaying() {
        assertEquals(CityState.PLAYING, CityState.valueOf("PLAYING"));
    }

    public void testValueOfPausedStateShouldBePaused() {
        assertEquals(CityState.PAUSED, CityState.valueOf("PAUSED"));
    }

    public void testValueOfOverStateShouldBeOver() {
        assertEquals(CityState.OVER, CityState.valueOf("OVER"));
    }

}
