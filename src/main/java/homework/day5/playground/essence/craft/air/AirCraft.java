package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;

public abstract class AirCraft extends Matter implements Flyable {
    protected static String name;

    public AirCraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}