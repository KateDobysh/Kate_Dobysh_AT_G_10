package homework.day5.playground.essence.material;

public class Petrol implements Pourable, Powerable{
    protected String name;

    public Petrol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}