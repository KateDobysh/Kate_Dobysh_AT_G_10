package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static void generateDirection() {
        Random randomValue = new Random();
        int randomVal = randomValue.nextInt(39) + 1;
        if (randomVal <= 9 && randomVal >= 1) {
            System.out.println("North");
        }
        if (randomVal <= 19 && randomVal >= 10) {
            System.out.println("South");
        }
        if (randomVal <= 29 && randomVal >= 20) {
            System.out.println("West");
        }
        if (randomVal <= 39 && randomVal >= 30) {
            System.out.println("East");
        }
    }

    public void fly() {
        DirectionGenerator generateDirection = new DirectionGenerator();
        generateDirection.fly();
    }

    public void move(){
        DirectionGenerator generateDirection = new DirectionGenerator();
        generateDirection.move();
    }


}
