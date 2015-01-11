package com.nispok.cityconnection.game.characters;

import junit.framework.TestCase;

public class PlayerCarTest extends TestCase {

    public void testPlayerCarShouldStartWithFiveOilCans() {
        PlayerCar playerCar = new PlayerCar();
        assertEquals(5, playerCar.getOilCansLeft());
    }

    public void testPlayerCarShouldStartWithZeroMileage() {
        PlayerCar playerCar = new PlayerCar();
        assertEquals(0f, playerCar.getMileage());
    }

    public void testOilCansShouldDecreaseAfterShooting() {
        PlayerCar playerCar = new PlayerCar();
        int oilCansLeft = playerCar.getOilCansLeft();
        playerCar.shoot();
        assertEquals(oilCansLeft - 1, playerCar.getOilCansLeft());
    }

    public void testOilCansLeftShouldNotBeLessThanZero() {
        PlayerCar playerCar = new PlayerCar();
        int timesToShoot = playerCar.getOilCansLeft() + 1;
        for (int i = 0; i < timesToShoot; i++) {
            playerCar.shoot();
        }
        assertEquals(0, playerCar.getOilCansLeft());
    }

    public void testPlayerCarShouldStartMovingRight() {
        PlayerCar playerCar = new PlayerCar();
        assertEquals(Direction.RIGHT, playerCar.getDirection());
    }

    public void testPlayerCarShouldChangeDirectionToLeftIfMovingRight() {
        PlayerCar playerCar = new PlayerCar();
        playerCar.changeDirection();
        assertEquals(Direction.LEFT, playerCar.getDirection());
    }

    public void testPlayerCarShouldChangeDirectionToRightIfMovingLeft() {
        PlayerCar playerCar = new PlayerCar();
        playerCar.changeDirection();
        playerCar.changeDirection();
        assertEquals(Direction.RIGHT, playerCar.getDirection());
    }

    public void testPlayerCarSpeedShouldBe15MilesPerSecond() {
        PlayerCar playerCar = new PlayerCar();
        assertEquals(15, playerCar.getSpeed());
    }

    public void testMileageShouldIncrementWhenUpdatingWithAPositiveDeltaTime() {
        PlayerCar playerCar = new PlayerCar();
        playerCar.updateMileage(1f);
        playerCar.updateMileage(1f);
        assertEquals(30f, playerCar.getMileage());
    }

    public void testMileageShouldIncrementWhenUpdatingWithANegativeDeltaTime() {
        PlayerCar playerCar = new PlayerCar();
        playerCar.updateMileage(1f);
        playerCar.updateMileage(-1f);
        assertEquals(30f, playerCar.getMileage());
    }

}
