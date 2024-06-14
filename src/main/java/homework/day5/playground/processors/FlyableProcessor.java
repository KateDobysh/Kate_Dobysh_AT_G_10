package homework.day5.playground.processors;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        Flyable fly = new Flyable() {
            @Override
            public void fly(String direction) {
                DirectionGenerator direction1 = new DirectionGenerator();
                direction1.fly();
            }
        };
    }

    public void runFlyable(Flyable flyable, String direction){
        Flyable flyable1 = new Flyable() {
            @Override
            public void fly(String direction) {

            }
        };

    }
    ;
}
