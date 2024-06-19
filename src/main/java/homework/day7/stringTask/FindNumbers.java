package homework.day7.stringTask;

import static java.awt.SystemColor.text;

public class FindNumbers {
    public static void main(String[] args) {
        String textWithNumbers = "I can run 10 mins and rest 60 min";
        String[] words = textWithNumbers.split(" ");

        for (String word : words) {
            if (isNumeric(word)) {
                System.out.println(word);
            }
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}