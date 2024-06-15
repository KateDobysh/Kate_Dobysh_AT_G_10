package homework.day5.playground.essence.craft.field;

public class Car extends Vehicle implements Rideable {
    protected String name;

    public Car(int mass, String name) {
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

    @Override
    public int move(int pointA, int pointB) {
        int point1 = pointA;
        int point2 = pointB;
        int difference = point2 - point1;

        System.out.printf("I am %s, my name is %s and I am moving from %d to %d", getClass().getSimpleName(), name, point1, point2);
        return difference;
    }

    @Override
    public void move(String direction) {

    }
}
