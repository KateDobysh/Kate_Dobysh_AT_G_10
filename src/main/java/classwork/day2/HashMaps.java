package classwork.day2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        String[] array = "mama myla ramy".split(" ");
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
            System.out.println(array[i]);
        }

        Set<Integer> keys = words.keySet();
        for (int key : keys){
            System.out.println(key);
        }
        Collection<String> values = words.values();
        for (String value : values){
            System.out.println(value);
        }
        Set<Map.Entry<Integer, String>> entries = words.entrySet();
    }
}
