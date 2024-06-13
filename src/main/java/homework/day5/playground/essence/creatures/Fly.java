package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    protected String name;

    public Fly(int mass, String name, String name1, String name2) {
        super(mass, name, name1);
        this.name = name2;
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

        String print = String.format("I am %s, my name is %s and I am flying to %s", Fly.this.name, getName(), direction);
    }
}