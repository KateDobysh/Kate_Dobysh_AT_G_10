package classwork.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTrain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu", "mama", "chisto");
        int x = (int) list.stream().filter(e -> e.equals("mama")).count();
        System.out.println(x);

        String printElse = list.stream().findFirst().orElse("mama");
        System.out.println(printElse);
        String printGet = list.stream().filter("mama"::equals).findFirst().get();
        System.out.println(printGet);
        String printSkip = list.stream().skip(4).findFirst().get();
        System.out.println(printSkip);
        List<String> str1 = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(str1);
        List<String> str2 = list.stream().filter(e -> e.contains("m")).distinct().collect(Collectors.toList()); //instead of collect.. use simply .toList
        System.out.println(str2);
    }
}