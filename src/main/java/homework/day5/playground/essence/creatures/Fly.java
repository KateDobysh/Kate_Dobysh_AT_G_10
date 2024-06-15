package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    protected String name;

    public Fly(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public void fly(String direction) {

        System.out.printf("I am %s, my name is %s and I am flying to %s\n", getClass().getSimpleName(), name, direction);
    }
}