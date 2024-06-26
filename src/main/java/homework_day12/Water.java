package homework_day12;

import java.util.Arrays;
import java.util.List;

public class Water {
    String color;
    String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }

    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Transaparent", "No"), new Water("Transparent", "No"), new Water("Dirty", "Ammonia"));

        for (Water color : water){
            System.out.println(color.getColor().toString() + " - water");
        }
    }
}