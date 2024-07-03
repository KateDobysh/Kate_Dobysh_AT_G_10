package homework_day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsTask {
    public static void main(String[] args) {
        List<String> birdsList = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        birdsList.stream().map(bird -> bird.replace("о", "а")).map(String::toLowerCase).map(bird -> bird.replace("ь", "")).map(bird -> bird.split("б")).collect(Collectors.toList()).forEach(bird -> System.out.print("--" + Arrays.toString(bird) + "--" + " "));
    }
}