package homework_day11;

import java.util.ArrayList;
import java.util.List;

public class CountriesList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        for (String country : countries) {
            System.out.print(country + ", ");
        }
        System.out.println();
        int count = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                count++;
            }
        }
        System.out.print("Amount of countries with less than 7 letters: " + count);
        for (int i = 0; i < countries.size(); i++) {
            String countriesList = countries.get(i);
            System.out.println(countriesList);
        }
    }
}