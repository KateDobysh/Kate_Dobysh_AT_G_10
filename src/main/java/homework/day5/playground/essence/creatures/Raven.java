package homework.day5.playground.essence.creatures;

public class Raven extends Vertebrata {
    protected String name;

    public Raven(String name, String name1) {
        super(name);
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
