package pretask;

public class Mouse {
    String name;
    int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + "и мне " + age + " лет");
    }
}
