package homework_day13;

import java.util.stream.Stream;

public class AutoTask {
    public static void main(String[] args) {
        Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").distinct().filter(auto -> auto.contains("и")).map(auto -> auto.toUpperCase()).skip(1).forEach(System.out::println);
    }
}