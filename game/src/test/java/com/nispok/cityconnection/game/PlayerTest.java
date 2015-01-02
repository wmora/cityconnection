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

}
