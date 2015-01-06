package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class BlockTest extends TestCase {

    public void testBlockShouldNotBeClearedByDefault() {
        Block block = new Block();
        assertFalse(block.isCleared());
    }

    public void testBlockShouldBeClearedAfterClear() {
        Block block = new Block();
        block.clear();
        assertTrue(block.isCleared());
    }
}
