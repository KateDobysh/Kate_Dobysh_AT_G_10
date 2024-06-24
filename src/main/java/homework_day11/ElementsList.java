package homework_day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class ElementsList {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");
        for (String element : elements){
            System.out.print(element + " ");
        }
        System.out.println();
//        List<String> splittedElements =
//        for (String element : elements){
//
//
//        }
    }
}
