package classwork.day4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SplittedBySymbols {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("mama", "myla", "ramu", "mama", "chisto");
        String splittedList = list.stream().flatMap(word -> Arrays.stream(word.split(""))).peek(System.out::print).max(String::compareTo).get();
        System.out.println();

        List<Person> myList = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        Person minAge = myList.stream().min(Comparator.comparing(value->value.age)).get();
        System.out.println("The one with min age is " + minAge);


    }
}
