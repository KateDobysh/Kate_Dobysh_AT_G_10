package homework.day5.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    protected String name;

    public Crocodile(int mass, String name) {
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
