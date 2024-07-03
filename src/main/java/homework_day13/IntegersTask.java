package homework_day13;

import java.util.stream.Stream;

public class IntegersTask {
    public static void main(String[] args) {
        Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).sorted().forEach(System.out::println);
        int total = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).sorted().reduce(0,Integer::sum);
        System.out.println("in total: " + total);
    }
}
