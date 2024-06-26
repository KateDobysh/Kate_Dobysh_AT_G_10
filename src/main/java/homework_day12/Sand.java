package homework_day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sand {
    int weight;
    String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return weight + name;
    }

    public static void main(String[] args) {
        List<Sand> sand = new ArrayList<>();
        sand.add(new Sand(2, "River"));
        sand.add(new Sand(4, "River"));
        sand.add(new Sand(2, "Canyon"));
        sand.add(new Sand(7, "River"));

        for (Sand weightValue : sand){
            System.out.print(weightValue.getWeight() + " ");
        }

        System.out.println();
        for (Sand nameValue : sand){
            System.out.print(nameValue.getName() + " ");
        }

        Map<Integer, Sand> myMap = new HashMap<>();
        myMap.put(1, sand.get(0));
        myMap.put(2, sand.get(1));
        myMap.put(3, sand.get(2));
        myMap.put(4, sand.get(3));

        for (Integer key : myMap.keySet()) {
            System.out.println(key + " ");
        }

        System.out.println();
        for (Sand set : myMap.values()){
            System.out.println("Pair set: " + set);
        }

        System.out.println();
        for (Map.Entry<Integer, Sand> fullSet : myMap.entrySet()){
            System.out.println("Total set: " + fullSet.getKey() + " " + fullSet.getValue().weight + " " + fullSet.getValue().name);
        }
    }
}
