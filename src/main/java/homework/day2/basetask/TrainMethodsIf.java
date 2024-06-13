package main.java.homework.day2.basetask;

public class TrainMethodsIf {
    public int returnNewInt(int number) {
        if (number < 8) {
            return number * 7;
        } else {
            return number / 4;
        }
    }

    public int returnNewLong(long number) {
        if (number > 300) {
            return (int) (number - 300);
        } else {
            return (int) (number + 20);
        }
    }

    public String returnNewChar(char symbol) {
        if (symbol == 'g') {
            return new String("go");
        } else {
            return new String("o" + symbol);
        }
    }

    public float returnNewFloat(float number) {
        if (number == 0.67f) {
            return number;
        } else {
            return number * 2;
        }
    }

    public double returnNewDouble(double number) {
        if (number > 30 & 80 > number) {
            return number + 87;
        }
        if (number > 80 & 400 > number) {
            return number - 87;
        }
        if (number > 400) {
            return number / 4;
        } else {
            return number;
        }
    }

    public boolean returnNewBoolean(boolean value) {
        if (value) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
        return value;
    }
}
