package homework.day5.playground.essence.creatures;

public class Chamomile extends Flower {
    protected String name;

    public Chamomile(int mass, String name) {
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
