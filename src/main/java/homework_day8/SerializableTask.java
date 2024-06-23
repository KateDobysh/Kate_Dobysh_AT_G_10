package homework_day8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializableTask implements Serializable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase you want to put inside the expression within the serializable interface:");
        String enteredString = scanner.nextLine();
        System.out.printf("Hello, I just got %s from you ", enteredString);

        try (FileOutputStream fos = new FileOutputStream("serFile.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(enteredString);
            System.out.println();
            System.out.println("serFile.txt was serialized");
        } catch
        (IOException e) {
            System.out.println("Your file was not serialized");
            e.printStackTrace();
        }
    }
}
