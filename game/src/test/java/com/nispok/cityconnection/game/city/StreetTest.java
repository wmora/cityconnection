package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class StreetTest extends TestCase {

    public void testStreetShouldHaveBlocks() {
        Street street = new Street();
        assertNotNull(street.getBlocks());
    }

    public void testStreetShouldHaveAtLestOneBlock() {
        Street street = new Street();
        assertTrue(street.getBlocks().size() > 0);
    }

    public void testStreetShouldBeClearedIfAllBlocksAreCleared() {
        Street street = new Street();
        for (Block block : street.getBlocks()) {
            block.clear();
        }
        assertTrue(street.isCleared());
    }

    public void testStreetShouldNotBeClearedIfAtLeastOneBlockIsNotCleared() {
        Street street = new Street();
        for (int i = 0; i < street.getBlocks().size() - 1; i++) {
            street.getBlocks().get(i).clear();
        }
        assertFalse(street.isCleared());
    }

}
