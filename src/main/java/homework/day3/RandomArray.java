package main.java.homework.day3;

import java.util.Random;

public class RandomArray {
    public void randomArray() {
        int[] array;
        array = new int[7];
        Random random = new Random();
        int a = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(a);
            System.out.print(array[i] + " ");
        }
    }
}
