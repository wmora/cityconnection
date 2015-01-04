package com.nispok.cityconnection.game;

import com.nispok.cityconnection.game.characters.Car;
import com.nispok.cityconnection.game.characters.Direction;
import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testPlayerShouldStartWithFiveOilCans() {
        Car car = new Car();
        assertEquals(5, car.getOilCansLeft());
    }

    public void testPlayerShouldStartWithZeroMileage() {
        Car car = new Car();
        assertEquals(0, car.getMileage());
    }

    public void testOilCansShouldDecreaseAfterShooting() {
        Car car = new Car();
        int oilCansLeft = car.getOilCansLeft();
        car.shoot();
        assertEquals(oilCansLeft - 1, car.getOilCansLeft());
    }

    public void testPlayerShouldStartMovingRight() {
        Car car = new Car();
        assertEquals(Direction.RIGHT, car.getDirection());
    }

    public void testPlayerShouldChangeDirectionToLeftIfMovingRight() {
        Car car = new Car();
        car.changeDirection();
        assertEquals(Direction.LEFT, car.getDirection());
    }

    public void testPlayerShouldChangeDirectionToRightIfMovingLeft() {
        Car car = new Car();
        car.changeDirection();
        car.changeDirection();
        assertEquals(Direction.RIGHT, car.getDirection());
    }

}
