package com.nispok.cityconnection.game.city;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Block> blocks;

    public Street() {
        blocks = new ArrayList<Block>();
    }

    public List<Block> getBlocks() {
        return blocks;
    }

}
