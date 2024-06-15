package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    protected String name;

    public Beetle(int mass, String name) {
        super(mass);
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getMass() {
        return mass;
    }


    public void setMass(int mass) {
        this.mass = mass;
    }

    public void nest(Carrot home) {
        double beetleMass = 0.0001;
        double carrotMass = 0.3;
        int intpart = (int) (carrotMass / beetleMass);
        if (beetleMass < carrotMass) {

            System.out.printf("I am %s and I will nest there with %d my family members\n", getName(), intpart);

        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}