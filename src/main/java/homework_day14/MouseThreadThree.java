package homework_day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MouseThreadThree {
    public static void main(String[] args) throws InterruptedException {
        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 0; i < 380; i++) {
            mouseList.add(new Mouse(i));
        }
        for (int t = 0; t < 7; t++) {
            Thread thread4 = new Thread(() -> {
                for (Mouse mouse : mouseList) {

                    try {
                        Thread.sleep(250);
                        mouse.peep();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (mouseList) {
                        Iterator<Mouse> mouseIterator = mouseList.iterator();
                        while (mouseIterator.hasNext()) continue;
                        mouseIterator.remove();
                    }
                }
            });
            thread4.start();
            thread4.join();
        }
    }
}