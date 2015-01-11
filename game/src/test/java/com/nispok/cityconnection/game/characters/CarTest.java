package com.nispok.cityconnection.game.characters;

import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testCarShouldStartWithFiveOilCans() {
        Car car = new Car();
        assertEquals(5, car.getOilCansLeft());
    }

    public void testCarShouldStartWithZeroMileage() {
        Car car = new Car();
        assertEquals(0f, car.getMileage());
    }

    public void testOilCansShouldDecreaseAfterShooting() {
        Car car = new Car();
        int oilCansLeft = car.getOilCansLeft();
        car.shoot();
        assertEquals(oilCansLeft - 1, car.getOilCansLeft());
    }

    public void testCarShouldStartMovingRight() {
        Car car = new Car();
        assertEquals(Direction.RIGHT, car.getDirection());
    }

    public void testCarShouldChangeDirectionToLeftIfMovingRight() {
        Car car = new Car();
        car.changeDirection();
        assertEquals(Direction.LEFT, car.getDirection());
    }

    public void testCarShouldChangeDirectionToRightIfMovingLeft() {
        Car car = new Car();
        car.changeDirection();
        car.changeDirection();
        assertEquals(Direction.RIGHT, car.getDirection());
    }

    public void testCarSpeedShouldBe15MilesPerSecond() {
        Car car = new Car();
        assertEquals(15, car.getSpeed());
    }

    public void testMileageShouldIncrementWhenUpdatingWithAPositiveDeltaTime() {
        Car car = new Car();
        car.updateMileage(1f);
        car.updateMileage(1f);
        assertEquals(30f, car.getMileage());
    }

    public void testMileageShouldIncrementWhenUpdatingWithANegativeDeltaTime() {
        Car car = new Car();
        car.updateMileage(1f);
        car.updateMileage(-1f);
        assertEquals(30f, car.getMileage());
    }

}
