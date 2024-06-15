package homework.day5.playground.processors;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String randomDir = DirectionGenerator.generateDirection();
        flyable.fly(randomDir);
    }

    public void runFlyable(Flyable flyable, String direction) {
        String direction1 = direction;
        flyable.fly(direction1);

    }
}