package org.example.Model;

import java.util.Arrays;
import java.util.List;

public class Food {
    private String name;
    private List<Integer> units;

    public Food(String name, Integer... units) {
        this.name = name;
        setUnits(units);
    }

    public void setUnits(Integer... units) {
        this.units = Arrays.asList(units);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getUnits() {
        return units;
    }
}
