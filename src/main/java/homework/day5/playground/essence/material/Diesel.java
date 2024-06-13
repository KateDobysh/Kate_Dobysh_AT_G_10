package homework.day5.playground.essence.material;

public class Diesel implements Pourable{
    protected String name;

    public Diesel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}