package homework_day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class CarsList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");
        String result = "";
        for (String car : cars) {
            result += car + " ";
            try (FileOutputStream fos = new FileOutputStream("carFile.txt");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(result);
            } catch (RuntimeException | IOException e) {
                e.printStackTrace();
            }
        }
        try {
            for (String car : cars) {
                if (car.length() > 4) {
                    cars.remove(car);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught");
        }
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}