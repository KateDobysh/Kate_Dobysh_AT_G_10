package classwork.day4;

import java.util.Arrays;
import java.util.List;

public class CompareTask {
    public static void main(String[] args) {
        List<Person> myList = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        List<String> list = Arrays.asList("mama", "myla", "ramu", "mama", "chisto");

        List<String> list1 = list.stream().sorted().toList();
        List<String> sortedListReversed = list.stream().sorted((a, b) -> -a.compareTo(b)).toList();
        List<Person> sortedBySex = myList.stream().sorted((a, b) -> {
            if (a.getSex() == b.getSex()) {
                return a.getAge() - b.getAge();
            } else{
                return a.getSex().compareTo(b.getSex());
            }
        }).peek(c -> System.out.println(c.getAge())).toList();
    }
}