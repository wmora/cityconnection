package com.nispok.cityconnection.game.characters;

public class PoliceCar extends Car {

    private boolean hit;

    public PoliceCar() {
        speed = 12;
        direction = Direction.RIGHT;
        hit = false;
    }

    public void hit() {
        hit = true;
    }

    public boolean isHit() {
        return hit;
    }
}
