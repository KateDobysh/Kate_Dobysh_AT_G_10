package homework_day13;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflyList = new ArrayList<>();
        butterflyList.add("Common blue");
        butterflyList.add("Swallowtail");
        butterflyList.add("Aglais io");
        butterflyList.add("Common blue");

        butterflyList.stream().map(butterfly -> "\"" + butterfly + "\"").filter(butterfly -> butterfly.contains("a") && butterfly.contains("o")).forEach(System.out::println);
    }
}
