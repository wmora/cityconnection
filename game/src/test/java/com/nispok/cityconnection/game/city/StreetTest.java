package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class StreetTest extends TestCase {

    public void testStreetShouldHaveBlocks() {
        Street street = new Street();
        assertNotNull(street.getBlocks());
    }

    public void testStreetShouldHaveAtLestOneBlock() {
        Street street = new Street();
        assertTrue(street.getBlocks().size() == 1);
    }

    public void testStreetShouldBeClearedIfAllBlocksAreCleared() {
        Street street = new Street();
        for (Block block : street.getBlocks()) {
            block.clear();
        }
        assertTrue(street.isCleared());
    }

}
