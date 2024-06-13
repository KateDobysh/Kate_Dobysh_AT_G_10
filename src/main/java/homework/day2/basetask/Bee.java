package main.java.homework.day2.basetask;

public class Bee {
    String gender;
    long number;

    public Bee(String gender, long number) {
        this.gender = gender;
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public long getNumber() {
        return number;
    }

    public void setGender() {
        this.gender = gender;
    }

    public void setNumber() {
        this.number = number;
    }

    public void printBeeDetails() {
        long calculation = 500 / number;
        System.out.println("Я легче лося в " + calculation + " раз");
    }
}
