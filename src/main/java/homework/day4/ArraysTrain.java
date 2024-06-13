package homework.day4;

public class ArraysTrain {
    int[] array = {3, 2, 3, 4, 5};

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printArray(int n) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + n + " ");
        }
    }

    public void printOnlyMoreThanNreverse(int n) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > n) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void dividedByFirst() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % array[0] == 0) {
                sum += array[i];
            }
        }
        System.out.print(sum);
    }

    public void printDog(){
        System.out.printf("\t  ^__^\n" +
                          "\t  (oo)\\\\_______\n" +
                          "\t (__)\\ ) \\/\\  \\\n" +
                         "\t      ||----w |\\\n" +
                         "\t      ||     ||");
    }

    public static void main(String[] args) {
        ArraysTrain printResult = new ArraysTrain();
        printResult.printArray(5);
        System.out.println();

        ArraysTrain printOnly = new ArraysTrain();
        printOnly.printOnlyMoreThanNreverse(2);
        System.out.println();

        ArraysTrain printDivided = new ArraysTrain();
        printDivided.dividedByFirst();
        System.out.println();

        ArraysTrain printD = new ArraysTrain();
        printD.printDog();
        System.out.println();

    }
}
