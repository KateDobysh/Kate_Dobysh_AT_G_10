package homework_day13;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountriesTask {
    public static void main(String[] args) {

        Stream.of("Андора", "Португалия", "Англия", "Замбия").filter(country -> country.matches("[Аи]+")).map(country -> country.toUpperCase()).map(country -> "\"" + country + "\"").forEach(System.out::println);
    }
}