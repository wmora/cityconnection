package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.enums.Direction;
import junit.framework.TestCase;

public class PlayerTest extends TestCase {

    public void testPlayerShouldStartWithFiveOilCans() {
        Player player = new Player();
        assertEquals(5, player.getOilCansLeft());
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

    public void testPlayerShouldStartMovingRight() {
        Player player = new Player();
        assertEquals(Direction.RIGHT, player.getDirection());
    }

    public void testPlayerShouldChangeDirectionToLeftIfMovingRight() {
        Player player = new Player();
        player.changeDirection();
        assertEquals(Direction.LEFT, player.getDirection());
    }

    public void testPlayerShouldChangeDirectionToRightIfMovingLeft() {
        Player player = new Player();
        player.changeDirection();
        player.changeDirection();
        assertEquals(Direction.RIGHT, player.getDirection());
    }

}
