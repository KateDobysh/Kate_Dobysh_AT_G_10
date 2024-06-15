package homework.day5.playground.essence.creatures;

public class Pigeon extends Vertebrata {
    protected String name;

    public Pigeon(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void eat(Plant food){

        System.out.printf("I am %s and I am eating %s\n", getName(), food.getName());
    }
}
