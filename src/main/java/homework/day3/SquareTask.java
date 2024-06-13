package main.java.homework.day3;

public class SquareTask {
    public void squareTask() {
        int i;
        int b;
        int[] array = new int[5];
        for (i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (b = array.length - 1; b >= 0; b--) {
            System.out.print(b * b + " ");
        }
    }
}
