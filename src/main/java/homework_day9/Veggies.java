package homework_day9;

import java.util.ArrayList;
import java.util.List;

public class Veggies {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("pomidor");
        vegetables.add("ogurec");
        vegetables.add("kabachok");
        vegetables.add("batat");
        vegetables.add("kartocha");

        for(String veggie : vegetables){
            System.out.print(veggie + " ");
        }

        System.out.println();
        int counter = 0;
        for(String veggie : vegetables){
            if(veggie.contains("a")){
                counter++;
            }
        }
        System.out.println();
        System.out.println("Amount of vegetables containing a: " + counter);
    }
}
