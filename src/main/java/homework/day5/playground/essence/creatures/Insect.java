package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public abstract class Insect extends Animal {
    protected String name;

    public Insect(int mass, String name, String name1) {
        super(mass, name);
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void eat(Insect food) {

        String print = String.format("I am %s and I am eating %s", getName(), food.getName());
        System.out.println(print);
    }
}