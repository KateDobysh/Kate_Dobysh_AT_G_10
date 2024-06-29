package classwork.day4;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> myList = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int countPerson = 0;
        for (Person person : myList) {
            if ((person.getSex() == Person.Sex.MAN && person.age < 60 && person.age > 18)
                    || (person.getSex() == Person.Sex.WOMEN && person.age < 55 && person.age > 18)) {
                countPerson++;
            }
        }
        System.out.println("Amount of working people: " + countPerson);

        long count1 = myList.stream().filter(person -> {
            return (person.getSex() == Person.Sex.MAN && person.age < 60 && person.age > 18)
                    || (person.getSex() == Person.Sex.WOMEN && person.age < 55 && person.age > 18);
        }).count();

        System.out.println("Amount of working people: " + count1);
    }
}