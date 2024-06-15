package homework.day6.stringTask;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        String text = "I can sit and I can look";
        String[] wordDuplicates = text.split(" ");
        String[] temporary = new String[wordDuplicates.length];


        for (String i = 0; i < wordDuplicates.length; i++ ){
            String word = wordDuplicates[i];
            if (wordDuplicates[i].equals(i)){
                temporary[0] = i;
                System.out.println(Arrays.toString(wordDuplicates));
            }
        }
    }
}