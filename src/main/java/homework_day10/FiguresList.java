package homework_day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresList {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        String result = "";
        for (String figure : figures) {
            result += figure + " - ";
            try (FileOutputStream fos = new FileOutputStream("figureFile.txt");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(result);
            } catch (RuntimeException | IOException e) {
                e.printStackTrace();
            }
        }
        int counter = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                counter++;
            }
        }
        System.out.print("Amount of figures that do not contain и: " + counter);
        System.out.println();

        for (int i = 0; i < figures.size(); i++) {
            String figuresList = figures.get(i);
            System.out.print(figuresList + " ");
        }

        System.out.println();
        List<String> modFigures = new ArrayList<>(figures);
        modFigures.add(3, "Треугольник");
        for (String figure : modFigures){
            System.out.print(figure + " ");
        }
    }
}
