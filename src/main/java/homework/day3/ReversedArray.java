package main.java.homework.day3;

public class ReversedArray {
    public void reversedArray() {
        int i;
        int b;
        int[] array = new int[5];
        for (i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        for (b = array.length - 1; b >= 0; b--) {
            System.out.print(b + " ");
        }
    }
}
