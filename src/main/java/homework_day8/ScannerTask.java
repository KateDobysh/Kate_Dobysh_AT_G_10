package homework_day8;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase you want to put inside the expression:");
        String enteredString = scanner.nextLine();
        System.out.printf("Hello, I just got %s from you!", enteredString);
    }
}