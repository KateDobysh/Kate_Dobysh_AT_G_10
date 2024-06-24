package homework_day9;

import java.util.ArrayList;
import java.util.List;

public class ColorsTask {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            System.out.print(color + " ");

        }
        System.out.println();
        colors.add(1, "Pink");
        colors.add(3, "Yellow");

        for (int i = 0; i < colors.size(); i++) {
            String colorsString = colors.get(i);
            System.out.print(colorsString + " ");
        }
        System.out.println();
        String colorsString1 = colors.get(0) + " " + colors.get(4);
        System.out.print(colorsString1);
    }
}