package homework_day14;

public class Mouse {

    private String pattern = "Mouse %s";
    private String name;
    private int number;
    ;

    public Mouse(int number) {
        this.number = number;
        this.name = String.format(pattern, number);
    }

    public int getNumber() {
        return number;
    }

    public void peep() throws InterruptedException {
        System.out.println(this.name + " PEEP!");
        Thread.sleep(200);
    }
}