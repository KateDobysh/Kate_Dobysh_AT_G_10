package homework.day5.playground.essence.creatures;

public abstract class Vertebrata {
    protected String name;

    public Vertebrata(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(Insect food){

        String print = String.format("I am %s and I am eating %s", getName(), food.getName());
        System.out.println(print);
    }
}
