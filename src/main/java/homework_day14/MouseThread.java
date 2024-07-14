package homework_day14;

import java.util.ArrayList;
import java.util.List;

public class MouseThread {
    public static void main(String[] args) throws InterruptedException {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mouseList.add(new Mouse(i));
        }
        for (int t = 0; t < 5; t++) {
            Thread thread1 = new Thread(() -> {
                for (Mouse mouse : mouseList) {
                    try {
                        mouse.peep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            thread1.start();
            thread1.join();
        }
    }
}