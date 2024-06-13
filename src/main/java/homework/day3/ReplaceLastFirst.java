package main.java.homework.day3;

public class ReplaceLastFirst {
    public void replaceLastFirst() {

        int[] array = {1, 2, 3, 4, 5, 6};
        int first = array[0];
        int last = array[array.length - 1];
        array[array.length - 1] = first;
        array[0] = last;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}