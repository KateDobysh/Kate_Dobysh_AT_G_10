package project.bubbles;

public class SparklingWater extends Water {
    int sparkles;

    public int getSparkles() {
        return sparkles;
    }

    public void setSparkles(int sparkles) {
        this.sparkles = sparkles;
    }

    public void sparkles(int number) {
        System.out.println("1 l of water contains 10000 bubbles");
    }
}
