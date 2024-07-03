package homework_day13.categories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    public static void main(String[] args) {
        List<Cities> cities = new ArrayList<>();
        cities.add(new Cities("Москва", 12000000));
        cities.add(new Cities("Нью-Йорк", 8400000));
        cities.add(new Cities("Париж", 2200000));

        for (Cities cityName : cities){
            System.out.print(cityName.getName() + " ");
        }
        System.out.println();

        for (Cities cityPopulation : cities){
            System.out.print(cityPopulation.getPopulations() + " ");
        }
        System.out.println();

        Map<String, Cities> myMap = new HashMap<>();
        myMap.put("Москва", new Cities("Москва", 12000000));
        myMap.put("Нью-Йорк", new Cities("Нью-Йорк", 8400000));
        myMap.put("Париж", new Cities("Париж", 2200000));

        int sum = 0;
        for (Cities population : myMap.values()){
            sum += population.getPopulations();
        }
        System.out.println("Total population: " + sum);
    }
}