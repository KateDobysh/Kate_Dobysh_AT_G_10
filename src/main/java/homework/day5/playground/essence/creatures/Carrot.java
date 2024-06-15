package homework.day5.playground.essence.creatures;

public class Carrot extends Vegetable {
    protected String name;

    public Carrot(int mass, String name, String name1, String name2) {
        super(mass, name, name1);
        this.name = name2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void nest(Carrot home) {
        double beetleMass = 0.0001;
        double carrotMass = 0.3;
        int intpart = (int) (carrotMass/beetleMass);
        if (beetleMass < carrotMass) {

            System.out.printf("I am %s and I will nest there with %d my family members\n", getName(), intpart);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}