package homework.day5.playground.essence.craft.air;

public class Rocket extends AirCraft {
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

}
