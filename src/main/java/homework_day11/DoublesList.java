package homework_day11;

import java.util.Arrays;
import java.util.List;



public class DoublesList {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        for (Double doubleNumber : doubles) {
            System.out.print(doubleNumber + " ");
        }
        Double multipliedDoubles = 1.0;
        for (int i = 0; i < doubles.size(); i++) {
            multipliedDoubles *= doubles.get(i);
        }
        System.out.println();
        System.out.println("Multiplied amount: " + multipliedDoubles);

        double sumNoInt = 0.0;
        for (Double number : doubles){
            double noInt = number - number.intValue();
            sumNoInt += noInt;
        }
        System.out.println("Sum of all the doublepart: " + sumNoInt);


        for (int i = 0; i < doubles.size(); i++) {
            Integer integ = (int) Math.round(doubles.get(i));
            System.out.print(integ + " ");
        }
    }
}