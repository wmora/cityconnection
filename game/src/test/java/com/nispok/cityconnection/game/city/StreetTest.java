package com.nispok.cityconnection.game.city;

import junit.framework.TestCase;

public class StreetTest extends TestCase {

    public void testStreetShouldHaveBlocks() {
        Street street = new Street();
        assertNotNull(street.getBlocks());
    }

}
