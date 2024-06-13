package main.java.project.bubbles;

public class Runner {
    public static void main(String[] args) {
        Bubble gas = new Bubble();
        gas.printCramp(500);
        System.out.println();

        SparklingWater litr1 = new SparklingWater();
        litr1.sparkles(10000);
        System.out.println();
    }
}
