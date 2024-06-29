package classwork.day4;

public class Person {
    public String name;
    public int age;
    public Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public enum Sex {MAN, WOMEN}

    public String toString(){
        return name + " " + age + " " + sex;
    }
}