package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;

public class Rocket extends AirCraft implements Flyable {
    protected String name;

    public Rocket(int mass, String name, String name1) {
        super(mass, name);
        this.name = name1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {

        String print = String.format("I am %s, my name is %s and I am flying to %s", Rocket.this.name, getName(), direction);
    }
}