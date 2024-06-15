package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    protected String name;

    public Mosquito(int mass, String name) {
        super(mass);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setMass(int masse) {
        this.mass = mass;
    }


    public void fly(String direction) {

        System.out.printf("I am %s, my name is %s and I am flying to %s\n", getClass().getSimpleName(), name, direction);
    }
}
