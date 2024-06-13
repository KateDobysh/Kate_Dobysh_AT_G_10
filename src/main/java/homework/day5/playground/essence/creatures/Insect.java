package homework.day5.playground.essence.creatures;

public class Insect extends Animal{
    protected String name;

    public Insect(int mass, String name, String name1) {
        super(mass, name);
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

