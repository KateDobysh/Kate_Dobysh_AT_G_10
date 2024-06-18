package homework.day6;

import homework.day5.playground.essence.craft.air.Copter;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> twoGen = new GenericMethodsInGenericClassTwoParams<>();
        twoGen.genericMethodGenArgs("Two", "Strings");
        System.out.println();

        GenericMethodsInGenericClassTwoParams<String, Integer> twoGen1 = new GenericMethodsInGenericClassTwoParams<>();
        twoGen1.genericMethodGenArgs("Two", 20);
        System.out.println();

        GenericMethodsInGenericClassTwoParams<String, Double> twoGen2 = new GenericMethodsInGenericClassTwoParams<>();
        twoGen2.genericMethodGenArgs("Two", 25.2);
        System.out.println();

        GenericMethodsInGenericClassTwoParams<Integer, Integer> twoGen3 = new GenericMethodsInGenericClassTwoParams<>();
        twoGen3.genericMethodGenArgs(1, 5);
        System.out.println();

        System.out.println("Copter starts here");
        Copter copter = new Copter(1, "copter doesn't work");
        copter.genericMethodGenArgs("text");


    }
}
