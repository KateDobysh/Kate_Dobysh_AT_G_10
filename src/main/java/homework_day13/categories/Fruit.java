package homework_day13.categories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruit {

    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Яблоко", 120));
        fruits.add(new Fruits("Банан", 80));
        fruits.add(new Fruits("Груша", 150));
        fruits.add(new Fruits("Апельсин", 200));

        for (Fruits name : fruits) {
            System.out.print(name.getName() + " ");
        }
        System.out.println();
        for (Fruits weight : fruits) {
            System.out.print(weight.getWeight() + " ");
        }

        Map<Integer, Fruits> myMap = new HashMap<>();
        myMap.put(1, fruits.get(0));
        myMap.put(2, fruits.get(1));
        myMap.put(3, fruits.get(2));
        myMap.put(4, fruits.get(3));
        System.out.println();

        for (Integer key : myMap.keySet()) {
            System.out.println(key + " ");
        }
        System.out.println();

        for (Fruits value : myMap.values()) {
            System.out.println(value.getName() + " " + value.getWeight());
        }
        System.out.println();

        for (Map.Entry<Integer, Fruits> fullSet : myMap.entrySet()){
            System.out.println(fullSet.getKey() + " " + fullSet.getValue().getName() + " " + fullSet.getValue().getWeight());
        }
    }
}