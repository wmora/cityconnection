package com.nispok.cityconnection.game.scenes;

import junit.framework.TestCase;

public class LevelSelectTest extends TestCase {

    public void testLevelSelectShouldHaveATitle() {
        LevelSelect levelSelect = new LevelSelect();
        assertNotNull(levelSelect);
    }

}
