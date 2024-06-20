package homework.day5.playground.essence.creatures;

public class Potato extends Vegetable {
    protected String name;

    public Potato(int mass, String name) {
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
