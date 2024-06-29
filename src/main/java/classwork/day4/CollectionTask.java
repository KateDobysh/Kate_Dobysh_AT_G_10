package classwork.day4;

import java.util.Arrays;
import java.util.List;

public class CollectionTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu", "mama", "chisto");
        boolean atLeastOne = list.stream().anyMatch(word -> word.equals("mama"));
        System.out.println(atLeastOne);

        boolean containsM = list.stream().allMatch(word -> word.contains("m"));
        System.out.println(containsM);

        List<String> newList = list.stream().map(word -> word + "m").toList();
        System.out.println(newList);

        newList.forEach(word -> System.out.print(word + " "));

        List<String> splittedByA = list.stream().flatMap(word -> Arrays.stream(word.split("a"))).filter(word1 -> !word1.isEmpty()).toList();
        System.out.println(splittedByA);
    }
}