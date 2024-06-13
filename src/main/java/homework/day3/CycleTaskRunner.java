package main.java.homework.day3;

public class CycleTaskRunner {
    public static void main(String[] args) {
        System.out.println("While range:");
        WhileTask printWhile = new WhileTask();
        printWhile.whileTask();
        System.out.println();

        System.out.println("Odd range:");
        OddTask printOdd = new OddTask();
        printOdd.oddTask();
        System.out.println();

        System.out.println("Random array:");
        RandomArray printArray = new RandomArray();
        printArray.randomArray();
        System.out.println();

        System.out.println("Reversed array:");
        ReversedArray printArray1 = new ReversedArray();
        printArray1.reversedArray();
        System.out.println();

        System.out.println("Each element x5:");
        MultipliedTask printMultiplied = new MultipliedTask();
        printMultiplied.multipliedTask();
        System.out.println();

        System.out.println("Each element x2:");
        SquareTask printSquare = new SquareTask();
        printSquare.squareTask();
        System.out.println();

        System.out.println("Min and Max elements:");
        MinMaxTask printMinMax = new MinMaxTask();
        printMinMax.minMax();
        System.out.println();

        System.out.println("Sorted elements:");
        SortTask printSort = new SortTask();
        printSort.sortTask();
        System.out.println();

        System.out.println("Replace first and last elements:");
        ReplaceLastFirst printReplaced = new ReplaceLastFirst();
        printReplaced.replaceLastFirst();
        System.out.println();
    }
}
