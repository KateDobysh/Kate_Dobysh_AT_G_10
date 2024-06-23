package homework_day8;

import java.io.*;

public class ReadEditNewInput {
    public static void main(String[] args) {
        String filePut = null;
        try {
            FileInputStream fis = new FileInputStream("serFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            filePut = (String) ois.readObject();
            System.out.println("Your file was deserialized ");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        char[] filePutEdit = filePut.toCharArray();
        char[] vowelsOnly = new char[filePutEdit.length];
        int vowels = 0;
        for (char character : filePutEdit) {
            if (isVowel(character)) {
                vowelsOnly[vowels++] = character;
            }
        }
    }

    private static boolean isVowel(char character) {
        return true;
    }

    {
        FileOutputStream fis = null;
        try {
            fis = new FileOutputStream("serFile.txt");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fis);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
