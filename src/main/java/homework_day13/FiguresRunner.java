package homework_day13;

import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
        Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").map(figure -> figure.length()).filter(length -> length > 4).forEach(length-> System.out.println(length));
    }
}
