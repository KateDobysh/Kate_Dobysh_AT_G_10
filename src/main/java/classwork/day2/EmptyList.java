package classwork.day2;

import java.util.ArrayList;
import java.util.List;

public class EmptyList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String[] array = "mama myla ramy".split(" ");
        for (String word : array) {
            myList.add(word);
            System.out.println(myList);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(myList.get(i));
        }
        System.out.println();
        for (String word : myList){
            System.out.println(word);
        }
    }
}
