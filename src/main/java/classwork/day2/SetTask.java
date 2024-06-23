package classwork.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] array = "mama myla ramy".split(" ");
        for (String word : array) {
            mySet.add(word);
        }

        for (String word : mySet) {
            System.out.println(word);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
