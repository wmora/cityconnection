package com.nispok.cityconnection.game;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {

    public void testPlayerShouldStartWithFiveOilCans() {
        Player player = new Player();
        assertEquals(player.getOilCansLeft(), 5);
    }

    public void testPlayerShouldStartWithThreeLives() {
        Player player = new Player();
        assertEquals(player.getLivesLeft(), 3);
    }

    public void testPlayerShouldStartWithZeroMileage() {
        Player player = new Player();
        assertEquals(player.getMileage(), 0);
    }

    public void testOilCansShouldDecreaseAfterShooting() {
        Player player = new Player();
        int oilCansLeft = player.getOilCansLeft();
        player.shoot();
        assertEquals(oilCansLeft - 1, player.getOilCansLeft());
    }

}
