package homework_day9;

import java.util.ArrayList;
import java.util.List;

public class NamesTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Olya");
        names.add("Kolya");
        names.add("Anya");
        names.add("Misha");
        names.add("Dasha");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        names.set(1, "Olya");
        names.set(3, "Katya");
        for (int i = 0; i < names.size(); i++) {
            String addedNames = names.get(i);
            System.out.print(addedNames + " ");
        }
        System.out.println();
        names.remove("Olya");
        names.remove(3);
        for (String name : names){
            System.out.print(name + " ");
        }
    }
}
