package homework_day13;

import java.util.ArrayList;
import java.util.List;

public class CitiesTask {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int total = cities.stream().mapToInt(city->city.length()).sum();
        System.out.println(total);
    }
}
