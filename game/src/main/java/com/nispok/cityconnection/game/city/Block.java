package com.nispok.cityconnection.game.city;

public class Block {

    private boolean cleared;

    public Block() {
        cleared = false;
    }

    public void clear() {
        cleared = true;
    }

    public boolean isCleared() {
        return cleared;
    }

}
