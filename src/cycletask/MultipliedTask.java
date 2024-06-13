package cycletask;

public class MultipliedTask {
    public void multipliedTask() {
        int i;
        int b;
        int[] array = new int[5];
        for (i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (b = array.length - 1; b >= 0; b--) {
            System.out.print(b * 5 + " ");
        }
    }
}