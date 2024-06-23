package homework_day8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEditNewInput {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("serFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            String filePut = (String) ois.readObject();
            System.out.println("Your file was deserialized ");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
    public void editFile(){

    }
}
