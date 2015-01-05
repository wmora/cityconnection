package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class CityTest extends TestCase {

    public void testCityShouldStartWithACar() {
        City city = new City();
        assertNotNull(city.getCar());
    }

    public void testCityShouldStartWithAState() {
        City city = new City();
        assertNotNull(city.getState());
    }

    public void testCityShouldStartInReadyState() {
        City city = new City();
        assertEquals(CityState.READY, city.getState());
    }

    public void testCityShouldGoToPlayingStateAfterStarting() {
        City city = new City();
        city.start();
        assertEquals(CityState.PLAYING, city.getState());
    }

    public void testCityShouldGoToPausedStateAfterPausing() {
        City city = new City();
        city.pause();
        assertEquals(CityState.PAUSED, city.getState());
    }

    public void testCityShouldGoToPlayingStateAfterResuming() {
        City city = new City();
        city.resume();
        assertEquals(CityState.PLAYING, city.getState());
    }

    public void testCityShouldGoToOverStateAfterFinishing() {
        City city = new City();
        city.finish();
        assertEquals(CityState.OVER, city.getState());
    }

    public void testCityShouldHaveAStreetMap() {
        City city = new City();
        assertNotNull(city.getStreetMap());
    }

    public void testCityStreetMapShouldHaveFourLevels() {
        City city = new City();
        assertEquals(4, city.getStreetMap().size());
    }

}
