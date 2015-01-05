package com.nispok.cityconnection.game.city;

import com.nispok.cityconnection.game.characters.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    private Car car;
    private CityState state;
    private Map<Integer, List<Street>> streetMap;

    public City() {
        car = new Car();
        state = CityState.READY;
        setUpStreetMap();
    }

    private void setUpStreetMap() {
        streetMap = new HashMap<Integer, List<Street>>();
        for (int i = 0; i < 4; i++) {
            streetMap.put(i, new ArrayList<Street>());
        }
    }

    public Car getCar() {
        return car;
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
