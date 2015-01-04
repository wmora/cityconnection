package com.nispok.cityconnection.game;

import junit.framework.TestCase;

public class LevelTest extends TestCase {

    public void testLevelShouldStartWithAPlayer() {
        Level level = new Level();
        assertNotNull(level.getCar());
    }

}
