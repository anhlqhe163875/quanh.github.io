package org.example.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColumnParsedData {
    private static final List<Food> foods;
    static {
        foods = new ArrayList<Food>();
        foods.add(new Food("Apple", 3, 4));
        foods.add(new Food("Pears", 2, 0));
        foods.add(new Food("Plums", 5, 11));
        foods.add(new Food("Bananas", 1, 1));
        foods.add(new Food("Oranges", 2, 4));
    }

    public static List<Food> getFoods() {
        return foods;
    }

    public static List<String> getPeople() {
        return Arrays.asList("Jane", "John");
    }
}
