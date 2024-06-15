package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.essence.creatures.Fly;

public class Plane extends AirCraft implements Flyable, Transportable {
    protected String name;

    public Plane(int mass, String name) {
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

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void fly(String direction) {

        System.out.printf("I am %s, my name is %s and I am flying to %s\n", getClass().getSimpleName(), name, direction);
    }

    public int move(int pointA, int pointB) {
        int point1 = pointA;
        int point2 = pointB;
        int difference = point2 - point1;

        System.out.printf("I am %s, my name is %s and I am moving from %d to %d", getClass().getSimpleName(), name, point1, point2);
        return difference;
    }

    public void move(String direction) {

    }
}
