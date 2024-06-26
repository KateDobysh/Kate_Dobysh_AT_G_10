package homework_day12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chair {
    int weight;
    int height;

    public Chair(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int toString(int weight, int height) {
        return weight + height;
    }

    public static void main(String[] args) {
        List<Chair> furniture = Arrays.asList(new Chair(2, 1), new Chair(2, 4), new Chair(4, 2));
        for (Chair value : furniture) {
            System.out.println("Height x weight = " + value.getHeight() * value.getWeight() + " ");
        }
        Map<Integer, Chair> myMap = new HashMap<>();
        myMap.put(1, furniture.get(0));
        myMap.put(2, furniture.get(1));
        myMap.put(3, furniture.get(2));

        for (Integer key : myMap.keySet()) {
            System.out.println(key);
        }
        for (Chair set : myMap.values()) {
            System.out.println("Height: " + set.getHeight() + " " + "Weight: " + set.getWeight());
        }
        for (Map.Entry<Integer, Chair> fullSet : myMap.entrySet()) {
            System.out.println("Key: " + fullSet.getKey() + " Weight: " + fullSet.getValue().getWeight() + " Height: " + fullSet.getValue().getHeight());
        }
    }
}