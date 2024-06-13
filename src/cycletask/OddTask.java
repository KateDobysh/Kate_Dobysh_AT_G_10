package cycletask;

public class OddTask {
    public void oddTask() {

        int a;
        for (a = 3; a <= 19; a++) {
            if (a % 2 == 1) {
                System.out.print(a + " ");
            }
        }
    }
}