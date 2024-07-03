package homework_day13.categories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {
    public static void main(String[] args) {
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars("Toyota", "Corolla"));
        cars.add(new Cars("Ford", "Mustang"));
        cars.add(new Cars("BMW", "X5"));
        for (Cars pair : cars) {
            System.out.println(pair.getBrand() + ":" + pair.getModel());
        }
        System.out.println();

        Map<String, Cars> myMap = new HashMap<>();
        myMap.put("Toyota", new Cars("Toyota", "Corolla"));
        myMap.put("Ford", new Cars("Ford", "Mustang"));
        myMap.put("BMW", new Cars("BMW", "X5"));
        for (String key : myMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        for (Cars pair : myMap.values()) {
            System.out.println(pair.getBrand() + " " + pair.getModel());
        }
        System.out.println();

        for (Map.Entry<String, Cars> fullSet : myMap.entrySet()) {
            System.out.println(fullSet.getKey() + " " + fullSet.getValue().getBrand() + " " + fullSet.getValue().getModel());
        }
    }
}