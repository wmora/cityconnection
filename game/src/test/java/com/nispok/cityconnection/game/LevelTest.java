package com.nispok.cityconnection.game;

import junit.framework.TestCase;

public class LevelTest extends TestCase {

    public void testLevelShouldStartWithACar() {
        Level level = new Level();
        assertNotNull(level.getCar());
    }

}
