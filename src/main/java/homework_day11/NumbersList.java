package homework_day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        Integer sum = 0;
        for (Integer number : numbers) {
            System.out.println(number + " ");
            sum += number;
        }
        System.out.println("Total amount of all numbers: " + sum);

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            Integer sortedNumbers = numbers.get(i);
            System.out.print(sortedNumbers + " ");
        }

        System.out.println();
        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}