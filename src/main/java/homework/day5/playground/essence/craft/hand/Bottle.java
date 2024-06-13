package homework.day5.playground.essence.craft.hand;

public class Bottle extends Container implements Storable{
    protected String name;

    public Bottle(int mass, String name, String name1) {
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
