package homework_day13.categories;

import java.util.Objects;

public class Fruits {
    private String name;
    private int weight;

    public Fruits(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return weight == fruits.weight && Objects.equals(name, fruits.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}