package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random randomValue = new Random();
        int randomV = randomValue.nextInt(80)+1;
        String print = String.format("CoordinatesGenerator: I have generated point with value %d", randomV);
        return randomV;
    }

    public void move() {
        CoordinatesGenerator generateCoordination = new CoordinatesGenerator();
        generateCoordination.move();
    }
}
