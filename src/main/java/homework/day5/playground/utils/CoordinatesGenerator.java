package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static void generateCoordinate() {
        Random randomValue = new Random();
        int randomV = randomValue.nextInt(80)+1;
        String print = String.format("CoordinatesGenerator: I have generated point with value %d", randomV);
    }
}
