package homework_day13;

import java.util.stream.Stream;

public class ElementsTask {
    public static void main(String[] args) {
        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb").map(element -> {
            if (element.length() % 2 == 0) {
                return element.replace("е", "о");
            } else {
                return String.valueOf(element.length());
            }
        }).distinct().forEach(System.out::println);
    }
}