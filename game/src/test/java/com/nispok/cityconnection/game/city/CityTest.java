package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class CityTest extends TestCase {

    public void testCityShouldStartWithAPlayerCar() {
        City city = new City();
        assertNotNull(city.getPlayerCar());
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
