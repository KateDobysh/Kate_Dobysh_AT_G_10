package homework_day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MouseThreadTwo {
    public static void main(String[] args) throws InterruptedException {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 0; i < 280; i++) {
            mouseList.add(new Mouse(i));
        }
        for (int t = 0; t < 5; t++) {
            Thread thread3 = new Thread(() -> {
                synchronized (mouseList) {
                    Iterator<Mouse> mouseIterator = mouseList.iterator();
                    while (mouseIterator.hasNext()) {
                        try {
                            mouseIterator.next().peep();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        mouseIterator.remove();
                    }
                }
            });
            thread3.start();
            thread3.join();
        }
    }
}