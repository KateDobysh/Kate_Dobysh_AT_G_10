package homework_day13;

import java.util.Random;
import java.util.stream.Stream;

public class DoubleTask {
    public static void main(String[] args) {
        Stream.of(33.42, 34.3, 2.79, 2.3426, 6.8, 13.24, 5.5, 769.9).mapToInt(value -> value.intValue()).map(value -> new Random().nextInt(0, value)).distinct().forEach(System.out::println);
    }
}