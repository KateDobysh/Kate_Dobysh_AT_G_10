package pretask;

public class TrainMethodsObjects {

    public void processMouse(){
        Mouse mouse1 = new Mouse("Mickey ", 5);
        mouse1.printMouseDetails();
    }

    public void processSouce(){
        Souce souce1 = new Souce("ketchup ", "red ");
        souce1.printSouceDetails();
    }

    public void processBee(){
        Bee bee1 = new Bee("male ", (long) 1.256565);
        bee1.printBeeDetails();
    }

    public void processObstacle(){
        Obstacle obstacle1 = new Obstacle("поспать", "срочное ");
        obstacle1.printObstacleDetails();
    }

    public void processPineapple(){
        Pineapple pineapple1 = new Pineapple("medium", 2.5);
        pineapple1.printPineappleDetails();
    }
}
