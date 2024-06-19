package homework.day5.playground.essence.creatures;

public class Rose extends Flower {
    protected String name;

    public Rose(int mass, String name) {
        super(mass);
        this.name = name;
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
