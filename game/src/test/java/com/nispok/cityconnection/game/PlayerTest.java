package com.nispok.cityconnection.game;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {

    public void testPlayerShouldStartWithFiveOilCans() {
        Player player = new Player();
        assertEquals(5, player.getOilCansLeft());
    }

    public void testPlayerShouldStartWithThreeLives() {
        Player player = new Player();
        assertEquals(3, player.getLivesLeft());
    }

    public void testPlayerShouldStartWithZeroMileage() {
        Player player = new Player();
        assertEquals(0, player.getMileage());
    }

    public void testOilCansShouldDecreaseAfterShooting() {
        Player player = new Player();
        int oilCansLeft = player.getOilCansLeft();
        player.shoot();
        assertEquals(oilCansLeft - 1, player.getOilCansLeft());
    }

}
