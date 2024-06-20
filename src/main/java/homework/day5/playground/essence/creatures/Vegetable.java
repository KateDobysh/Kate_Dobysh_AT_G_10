package homework.day5.playground.essence.creatures;

public class Vegetable extends Plant {
    protected String name;

    public Vegetable(int mass) {
        super(mass);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
