package homework.day6.stringTask;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        String text = "I can sit and I can look";
        String[] textSplitted = text.split(" ");
        String duplicates = "";
        for (int i = 0; i < textSplitted.length; i++) {
            for (int j = i + 1; j < textSplitted.length; j++) {
                if (textSplitted[i].equals(textSplitted[j]) && !duplicates.contains(textSplitted[i])) {
                    duplicates += textSplitted[i] + " ";
                    break;
                }
            }
        }
    }
}