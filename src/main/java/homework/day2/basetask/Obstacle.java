package homework.day2.basetask;

public class Obstacle {
    String description;
    String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setDescription() {
        this.description = description;
    }

    public void setSeverity() {
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + severity + "препятствиие " + description);
    }
}
