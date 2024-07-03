package homework_day13.categories;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    public static void main(String[] args) {
        List<Books> library = new ArrayList<>();
        library.add(new Books("Война и мир", "Толстой"));
        library.add(new Books("Преступление и наказание", "Достоевский"));
        library.add(new Books("Мастер и Маргарита", "Булгаков"));

        for (Books book : library){
            System.out.print(book.getName() + " " + book.getAuthor() + ", ");
        }
        System.out.println();

        Map<String, String> myMap = new HashMap<>();
        myMap.put("Война и мир", "Толстой");
        myMap.put("Преступление и наказание", "Достоевский");
        myMap.put("Мастер и Маргарита", "Булгаков");

        for (String key: myMap.keySet()){
            System.out.println(key + " ");
        }
        System.out.println();

        for (String value : myMap.values()){
            System.out.println(value + " ");
        }
        System.out.println();

        for (Map.Entry<String, String> fullSet : myMap.entrySet()){
            System.out.println(fullSet.getKey() + ", " + fullSet.getValue());
        }
    }
}