package main.java.homework.day2.basetask;

public class TrainMethodsPrimitive {
    public int printInt() {
        int number = 10;
        System.out.println("я получил на вход число " + number);
        return number;
    }

    public long printLong() {
        long number = 74545445566551l;
        System.out.println("я получил на вход  длинное число " + number);
        return number;
    }

    public char printChar() {
        char symbol = '@';
        System.out.println("я получил на вход символ " + symbol);
        return symbol;
    }

    public float printFloat() {
        float number = 1.56f;
        System.out.println("я получил на вход дробное число " + number);
        return number;
    }

    public double printDouble() {
        double number = 0.2d;
        System.out.println("я получил на вход длинное дробное число " + number);
        return number;
    }

    public short printShort() {
        short number = 1;
        System.out.println("я получил на вход короткое число " + number);
        return number;
    }

    public byte printByte() {
        byte value = (byte) 128;
        System.out.println("я получил на вход очень короткое число " + value);
        return value;
    }

    public boolean printBoolean() {
        boolean isTrue = true;
        System.out.println("я получил на вход булево " + isTrue);
        return isTrue;
    }
}
