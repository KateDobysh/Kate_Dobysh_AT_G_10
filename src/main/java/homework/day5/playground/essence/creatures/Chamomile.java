package homework.day5.playground.essence.creatures;

public class Chamomile extends Flower {
    protected String name;

    public Chamomile(int mass, String name, String name1) {
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
