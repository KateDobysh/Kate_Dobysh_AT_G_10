package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Plant extends Matter {
    protected static String name;

    public Plant(int mass) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food){

        System.out.printf("I am %s and I am eating %s\n", getName(), food.getName());
    }
}

