package homework.day5.playground.essence.creatures;

public class Flower extends Plant {
    protected String name;

    public Flower(int mass, String name) {
        super(mass, name);
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
