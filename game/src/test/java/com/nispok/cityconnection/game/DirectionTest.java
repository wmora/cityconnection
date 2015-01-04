package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.characters.Direction;
import junit.framework.TestCase;

public class DirectionTest extends TestCase {

    public void testThereShouldBeTwoDirections() {
        assertEquals(2, Direction.values().length);
    }

    public void testValueOfLeftShouldReturnLeft() {
        assertEquals(Direction.LEFT, Direction.valueOf("LEFT"));
    }

    public void testValueOfRightShouldReturnRight() {
        assertEquals(Direction.RIGHT, Direction.valueOf("RIGHT"));
    }

}
