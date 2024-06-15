package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random randomDirection = new Random();
        int randomDir = randomDirection.nextInt(39) + 1;
        if (randomDir <= 9 && randomDir >= 1) {
            System.out.println("North");
        }
        if (randomDir <= 19 && randomDir >= 10) {
            System.out.println("South");
        }
        if (randomDir <= 29 && randomDir >= 20) {
            System.out.println("West");
        }
        if (randomDir <= 39 && randomDir >= 30) {
            System.out.println("East");
        }
        return "";
    }

    public void fly() {
        DirectionGenerator generateDirection = new DirectionGenerator();
        generateDirection.fly();
    }

    public void move() {
        DirectionGenerator generateDirection = new DirectionGenerator();
        generateDirection.move();
    }


}
