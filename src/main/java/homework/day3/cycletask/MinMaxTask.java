package homework.day3.cycletask;

public class MinMaxTask {
    public void minMax() {
        int[] array = {5, 1, 2, 6};
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
                System.out.println("Min: " + i);
            }
            if (i > max) {
                System.out.println("Max: " + i);
            }
        }
    }
}

