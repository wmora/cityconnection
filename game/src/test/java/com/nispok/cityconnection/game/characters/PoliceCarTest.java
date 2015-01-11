package com.nispok.cityconnection.game.characters;

import junit.framework.TestCase;

public class PoliceCarTest extends TestCase {

    public void testPoliceCarShouldStartWithADirection() {
        PoliceCar policeCar = new PoliceCar();
        assertNotNull(policeCar.getDirection());
    }

    public void testPoliceCarSpeedShouldBe12MilesPerSecond() {
        PoliceCar policeCar = new PoliceCar();
        assertEquals(12, policeCar.getSpeed());
    }

}
