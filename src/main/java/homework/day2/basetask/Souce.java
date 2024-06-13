package homework.day2.basetask;

public class Souce {
    String name;
    String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName() {
        this.name = name;
    }

    public void setColor() {
        this.color = color;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + color + "цвета");
    }
}
