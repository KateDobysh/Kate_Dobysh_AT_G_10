package homework.day5.playground.essence.creatures;

public class Beetle extends Insect {
    protected String name;

    public Beetle(int mass, String name, String name1, String name2) {
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

            String print = String.format("I am %s and I will nest there with %d my family members", getName(), intpart);
            System.out.println(print);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}