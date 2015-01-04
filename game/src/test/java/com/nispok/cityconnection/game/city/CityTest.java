package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class CityTest extends TestCase {

    public void testLevelShouldStartWithACar() {
        City city = new City();
        assertNotNull(city.getCar());
    }

    public void testLevelShouldStartWithAState() {
        City city = new City();
        assertNotNull(city.getState());
    }

    public void testLevelShouldStartInReadyState() {
        City city = new City();
        assertEquals(CityState.READY, city.getState());
    }

    public void testLevelShouldGoToPlayingStateAfterStarting() {
        City city = new City();
        city.start();
        assertEquals(CityState.PLAYING, city.getState());
    }

    public void testLevelShouldGoToPausedStateAfterPausing() {
        City city = new City();
        city.pause();
        assertEquals(CityState.PAUSED, city.getState());
    }

    public void testLevelShouldGoToPlayingStateAfterResuming() {
        City city = new City();
        city.resume();
        assertEquals(CityState.PLAYING, city.getState());
    }

    public void testLevelShouldGoToOverStateAfterFinishing() {
        City city = new City();
        city.finish();
        assertEquals(CityState.OVER, city.getState());
    }

}
