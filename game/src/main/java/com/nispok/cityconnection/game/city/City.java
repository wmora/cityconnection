package com.nispok.cityconnection.game.city;

import com.nispok.cityconnection.game.characters.PlayerCar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    private PlayerCar playerCar;
    private CityState state;
    private Map<Integer, List<Street>> streetMap;

    public City() {
        playerCar = new PlayerCar();
        state = CityState.READY;
        setUpStreetMap();
    }

    private void setUpStreetMap() {
        streetMap = new HashMap<Integer, List<Street>>();
        for (int i = 0; i < 4; i++) {
            streetMap.put(i, new ArrayList<Street>());
        }
    }

    public PlayerCar getPlayerCar() {
        return playerCar;
    }

    public CityState getState() {
        return state;
    }

    public void start() {
        state = CityState.PLAYING;
    }

    public void pause() {
        state = CityState.PAUSED;
    }

    public void resume() {
        state = CityState.PLAYING;
    }

    public void finish() {
        state = CityState.OVER;
    }

    public Map<Integer, List<Street>> getStreetMap() {
        return streetMap;
    }
}
