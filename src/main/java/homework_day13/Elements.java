package homework_day13;
import java.util.HashMap;
import java.util.Map;

public class Elements {


    public static void main(String[] args) {
        Map<Integer, String> elements = new HashMap<>();
        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        System.out.println("Initial list in a line: ");
        for (String element : elements.values()) {
            System.out.print(element + " ");
        }

        System.out.println();
        int count = 0;
        for (String element : elements.values()) {
            if (element.contains("u")) {
                count++;
            }
        }
        System.out.println("Amount of elements, conting 'u': " + count);
        System.out.println("Initial list: ");
        for (Map.Entry<Integer, String> pair : elements.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        System.out.println("Updated list: ");
        elements.put(4, "Selenium");
        elements.remove(2);
        for (Map.Entry<Integer, String> updatedPair : elements.entrySet()) {
            System.out.println(updatedPair.getKey() + " " + updatedPair.getValue());
        }
    }
}