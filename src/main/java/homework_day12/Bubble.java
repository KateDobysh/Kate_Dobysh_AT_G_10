package homework_day12;

import java.util.Arrays;
import java.util.List;

public class Bubble {
    String name;
    int value;

    public Bubble(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String toString(){
        return name + " " + value;
    }

    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble("CO2", 2), new Bubble("O2", 4), new Bubble("CO", 5));

        for (Bubble bubbleValue : bubbles) {
            System.out.print(bubbleValue.getValue() + " ");
        }
        System.out.println();
        for (Bubble bubbleName : bubbles) {
            System.out.print(bubbleName.getName() + " ");
        }

        System.out.println();
        int sum = 0;
        for (Bubble bubbleValue : bubbles) {
            sum += bubbleValue.getValue();
        }
        System.out.println("Values in total: " + sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
