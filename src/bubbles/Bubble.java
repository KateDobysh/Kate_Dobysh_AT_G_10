package bubbles;

public class Bubble {
    public double volume = 0.3;
    public int gasContent;

    public void bubbles() {
        this.gasContent = gasContent;
    }


    public void setGasContent(int gasContent) {
        this.gasContent = gasContent;

    }

    public int printCramp(int gasContent) {
        int cramp = 100;
        double pressure = volume * gasContent;
        if (pressure > cramp) {
            System.out.println("I do cramp, when pressure is over " + cramp);
            System.out.println("Cramp!");
        } else {
            System.out.println("I'm not cramping yet .. it's only " + pressure);
        }
        return gasContent;
    }
}
