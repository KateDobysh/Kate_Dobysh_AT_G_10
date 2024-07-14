package homework_day14;

import java.util.ArrayList;
import java.util.List;

public class MouseThreadOne {
    public static void main(String[] args) throws InterruptedException {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            mouseList.add(new Mouse(i));
        }
        for (int t = 0; t < 5; t++) {
            Thread thread2 = new Thread(() -> {
                for (Mouse mouse : mouseList) {
                    if (mouse.getNumber() % 2 == 0) {
                        try {
                            mouse.peep();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            });
            thread2.start();
            thread2.join();
        }
    }
}