package com.nispok.cityconnection.game.city;

import com.nispok.cityconnection.game.characters.PlayerCar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {

    private static final int STREET_LEVELS = 4;

    private PlayerCar playerCar;
    private Map<Integer, List<Street>> streetMap;

    public City() {
        playerCar = new PlayerCar();
        setUpStreetMap();
    }

    private void setUpStreetMap() {
        streetMap = new HashMap<Integer, List<Street>>();
        for (int i = 0; i < STREET_LEVELS; i++) {
            streetMap.put(i, new ArrayList<Street>());
        }
    }

    public PlayerCar getPlayerCar() {
        return playerCar;
    }

    public Map<Integer, List<Street>> getStreetMap() {
        return streetMap;
    }
}
