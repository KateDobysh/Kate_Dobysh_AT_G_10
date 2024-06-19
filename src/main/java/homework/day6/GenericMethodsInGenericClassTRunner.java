package homework.day6;

import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.craft.air.Copter;
import project.bubbles.Bottle;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        System.out.println("String type:");
        GenericMethodsInGenericClassT<String> oneGenString = new GenericMethodsInGenericClassT<>();
        oneGenString.genericMethodOneGenArg("some string");
        GenericMethodsInGenericClassT<String> twoGenString = new GenericMethodsInGenericClassT<>();
        twoGenString.genericMethodTwoGenArgs("some string", "smth");
        GenericMethodsInGenericClassT<String> halfGenValues = new GenericMethodsInGenericClassT<>();
        halfGenValues.genericMethodHalfGenArgs("half string", "string");
        System.out.println();

        System.out.println("Integer type:");
        GenericMethodsInGenericClassT<Integer> oneGenInteger = new GenericMethodsInGenericClassT<>();
        oneGenInteger.genericMethodOneGenArg(1);
        GenericMethodsInGenericClassT<Integer> twoGenInteger = new GenericMethodsInGenericClassT<>();
        twoGenInteger.genericMethodTwoGenArgs(1, 5);
        GenericMethodsInGenericClassT<Integer> halfGenIntegers = new GenericMethodsInGenericClassT<>();
        halfGenIntegers.genericMethodHalfGenArgs(1, String.valueOf(5));
        System.out.println();

        System.out.println("Double type:");
        GenericMethodsInGenericClassT<Double> oneGenDouble = new GenericMethodsInGenericClassT<>();
        oneGenDouble.genericMethodOneGenArg(1.5);
        GenericMethodsInGenericClassT<Double> twoGenDouble = new GenericMethodsInGenericClassT<>();
        twoGenDouble.genericMethodTwoGenArgs(1.3, 5.1);
        GenericMethodsInGenericClassT<Double> halfGenDouble = new GenericMethodsInGenericClassT<>();
        halfGenDouble.genericMethodHalfGenArgs(1.9, (String.valueOf(2.6)));
        System.out.println();

        System.out.println("Copter type: ");
        Copter copterOneGen = new Copter(1, "one gen copter");
        GenericMethodsInGenericClassT<Copter> oneGenCopter = new GenericMethodsInGenericClassT<>();
        oneGenCopter.genericMethodOneGenArg(copterOneGen);

        Copter copterTwoGen = new Copter(2, "two gens copter");
        GenericMethodsInGenericClassT<Copter> twoGenCopter = new GenericMethodsInGenericClassT<>();
        twoGenCopter.genericMethodTwoGenArgs(copterTwoGen, copterTwoGen);

        Copter copterHalfGen = new Copter(3, "half gen copter");
        GenericMethodsInGenericClassT<Copter> halfGenCopter = new GenericMethodsInGenericClassT<>();
        halfGenCopter.genericMethodHalfGenArgs(copterHalfGen, "very long text");
        System.out.println();

        System.out.println("Plane type: ");
        Plane planeOneGen = new Plane(1, "one gen");
        GenericMethodsInGenericClassT<Plane> oneGenPlane = new GenericMethodsInGenericClassT<>();
        oneGenPlane.genericMethodOneGenArg(planeOneGen);

        Plane planeTwoGen = new Plane(2, "two gens");
        GenericMethodsInGenericClassT<Plane> twoGenPlane = new GenericMethodsInGenericClassT<>();
        twoGenPlane.genericMethodTwoGenArgs(planeTwoGen, planeTwoGen);

        Plane planeHalfGen = new Plane(3, "half gen");
        GenericMethodsInGenericClassT<Plane> halfGenPlane = new GenericMethodsInGenericClassT<>();
        halfGenPlane.genericMethodHalfGenArgs(planeHalfGen, "very long text");
        System.out.println();

        System.out.println("Rocket type: ");
        Rocket rocketOneGen = new Rocket(1, "one gen");
        GenericMethodsInGenericClassT<Rocket> oneGenRocket = new GenericMethodsInGenericClassT<>();
        oneGenRocket.genericMethodOneGenArg(rocketOneGen);

        Rocket rocketTwoGen = new Rocket(2, "two gens");
        GenericMethodsInGenericClassT<Rocket> twoGenRocket = new GenericMethodsInGenericClassT<>();
        twoGenRocket.genericMethodTwoGenArgs(rocketTwoGen, rocketTwoGen);

        Rocket rocketHalfGen = new Rocket(3, "half gen");
        GenericMethodsInGenericClassT<Rocket> halfGenRocket = new GenericMethodsInGenericClassT<>();
        halfGenRocket.genericMethodHalfGenArgs(rocketHalfGen, "very long text");
        System.out.println();

        System.out.println("Car type: ");
        Car carOneGen = new Car(1, "one gen");
        GenericMethodsInGenericClassT<Car> oneGenCar = new GenericMethodsInGenericClassT<>();
        oneGenCar.genericMethodOneGenArg(carOneGen);

        Car carTwoGen = new Car(2, "two gens");
        GenericMethodsInGenericClassT<Car> twoGenCar = new GenericMethodsInGenericClassT<>();
        twoGenCar.genericMethodTwoGenArgs(carTwoGen, carTwoGen);

        Car carHalfGen = new Car(3, "half gen");
        GenericMethodsInGenericClassT<Car> halfGenCar = new GenericMethodsInGenericClassT<>();
        halfGenCar.genericMethodHalfGenArgs(carHalfGen, "very long text");
        System.out.println();

        System.out.println("Moped type: ");
        Moped mopedOneGen = new Moped(1, "one gen");
        GenericMethodsInGenericClassT<Moped> oneGenMoped = new GenericMethodsInGenericClassT<>();
        oneGenMoped.genericMethodOneGenArg(mopedOneGen);

        Moped mopedTwoGen = new Moped(2, "two gens");
        GenericMethodsInGenericClassT<Moped> twoGenMoped = new GenericMethodsInGenericClassT<>();
        twoGenMoped.genericMethodTwoGenArgs(mopedTwoGen, mopedTwoGen);

        Moped mopedHalfGen = new Moped(3, "half gen");
        GenericMethodsInGenericClassT<Moped> halfGenMoped = new GenericMethodsInGenericClassT<>();
        halfGenMoped.genericMethodHalfGenArgs(mopedHalfGen, "very long text");
        System.out.println();

        System.out.println("Motorbike type: ");
        Motorbike motorbikeOneGen = new Motorbike(1, "one gen");
        GenericMethodsInGenericClassT<Motorbike> oneGenMotorbike = new GenericMethodsInGenericClassT<>();
        oneGenMotorbike.genericMethodOneGenArg(motorbikeOneGen);

        Motorbike motorbikeTwoGen = new Motorbike(2, "two gens");
        GenericMethodsInGenericClassT<Motorbike> twoGenMotorbike = new GenericMethodsInGenericClassT<>();
        twoGenMotorbike.genericMethodTwoGenArgs(motorbikeTwoGen, motorbikeTwoGen);

        Motorbike motorbikeHalfGen = new Motorbike(3, "half gen");
        GenericMethodsInGenericClassT<Motorbike> halfGenMotorbike = new GenericMethodsInGenericClassT<>();
        halfGenMotorbike.genericMethodHalfGenArgs(motorbikeHalfGen, "very long text");
        System.out.println();

        System.out.println("Bottle type: ");
        Bottle bottleOneGen = new Bottle();
        GenericMethodsInGenericClassT<Bottle> oneGenBottle = new GenericMethodsInGenericClassT<>();
        oneGenBottle.genericMethodOneGenArg(bottleOneGen);

        Bottle bottleTwoGen = new Bottle();
        GenericMethodsInGenericClassT<Bottle> twoGenBottle = new GenericMethodsInGenericClassT<>();
        twoGenBottle.genericMethodTwoGenArgs(bottleTwoGen, bottleTwoGen);

        Bottle bottleHalfGen = new Bottle();
        GenericMethodsInGenericClassT<Bottle> halfGenBottle = new GenericMethodsInGenericClassT<>();
        halfGenBottle.genericMethodHalfGenArgs(bottleHalfGen, "very long text");
        System.out.println();

        System.out.println("Can type: ");
        Can canOneGen = new Can(1, "text", "text");
        GenericMethodsInGenericClassT<Can> oneGenCan = new GenericMethodsInGenericClassT<>();
        oneGenCan.genericMethodOneGenArg(canOneGen);

        Can canTwoGen = new Can(2, "text", "text");
        GenericMethodsInGenericClassT<Can> twoGenCan = new GenericMethodsInGenericClassT<>();
        twoGenCan.genericMethodTwoGenArgs(canTwoGen, canTwoGen);

        Can canHalfGen = new Can(3, "text", "text");
        GenericMethodsInGenericClassT<Can> halfGenCan = new GenericMethodsInGenericClassT<>();
        halfGenCan.genericMethodHalfGenArgs(canHalfGen, "very long text");
        System.out.println();

        System.out.println("Mug type: ");
        Mug mugOneGen = new Mug(1, "text", "text");
        GenericMethodsInGenericClassT<Mug> oneGenMug = new GenericMethodsInGenericClassT<>();
        oneGenMug.genericMethodOneGenArg(mugOneGen);

        Mug mugTwoGen = new Mug(2, "text", "text");
        GenericMethodsInGenericClassT<Mug> twoGenMug = new GenericMethodsInGenericClassT<>();
        twoGenMug.genericMethodTwoGenArgs(mugTwoGen, mugTwoGen);

        Mug mugHalfGen = new Mug(3, "text", "text");
        GenericMethodsInGenericClassT<Mug> halfGenMug = new GenericMethodsInGenericClassT<>();
        halfGenMug.genericMethodHalfGenArgs(mugHalfGen, "very long text");
        System.out.println();

        System.out.println("Beetle type: ");
        Beetle beetleOneGen = new Beetle(1, "text");
        GenericMethodsInGenericClassT<Beetle> oneGenBeetle = new GenericMethodsInGenericClassT<>();
        oneGenBeetle.genericMethodOneGenArg(beetleOneGen);

        Beetle beetleTwoGen = new Beetle(2, "text");
        GenericMethodsInGenericClassT<Beetle> twoGenBeetle = new GenericMethodsInGenericClassT<>();
        twoGenBeetle.genericMethodTwoGenArgs(beetleTwoGen, beetleTwoGen);

        Beetle beetleHalfGen = new Beetle(3, "text");
        GenericMethodsInGenericClassT<Beetle> halfGenBeetle = new GenericMethodsInGenericClassT<>();
        halfGenBeetle.genericMethodHalfGenArgs(beetleHalfGen, "very long text");
        System.out.println();

        System.out.println("Carrot type: ");
        Carrot carrotOneGen = new Carrot(1, "text");
        GenericMethodsInGenericClassT<Carrot> oneGenCarrot = new GenericMethodsInGenericClassT<>();
        oneGenCarrot.genericMethodOneGenArg(carrotOneGen);

        Carrot carrotTwoGen = new Carrot(2, "text");
        GenericMethodsInGenericClassT<Carrot> twoGenCarrot = new GenericMethodsInGenericClassT<>();
        twoGenCarrot.genericMethodTwoGenArgs(carrotTwoGen, carrotTwoGen);

        Carrot carrotHalfGen = new Carrot(3, "text");
        GenericMethodsInGenericClassT<Carrot> halfGenCarrot = new GenericMethodsInGenericClassT<>();
        halfGenCarrot.genericMethodHalfGenArgs(carrotHalfGen, "very long text");
        System.out.println();

        System.out.println("Chamomile type: ");
        Chamomile chamomileOneGen = new Chamomile(1, "text");
        GenericMethodsInGenericClassT<Chamomile> oneGenChamomile = new GenericMethodsInGenericClassT<>();
        oneGenChamomile.genericMethodOneGenArg(chamomileOneGen);

        Chamomile chamomileTwoGen = new Chamomile(2, "text");
        GenericMethodsInGenericClassT<Chamomile> twoGenChamomile = new GenericMethodsInGenericClassT<>();
        twoGenChamomile.genericMethodTwoGenArgs(chamomileTwoGen, chamomileTwoGen);

        Chamomile chamomileHalfGen = new Chamomile(3, "text");
        GenericMethodsInGenericClassT<Chamomile> halfGenChamomile = new GenericMethodsInGenericClassT<>();
        halfGenChamomile.genericMethodHalfGenArgs(chamomileHalfGen, "very long text");
        System.out.println();

        System.out.println("Crocodile type: ");
        Crocodile crocodileOneGen = new Crocodile(1, "text");
        GenericMethodsInGenericClassT<Crocodile> oneGenCrocodile = new GenericMethodsInGenericClassT<>();
        oneGenCrocodile.genericMethodOneGenArg(crocodileOneGen);

        Crocodile crocodileTwoGen = new Crocodile(2, "text");
        GenericMethodsInGenericClassT<Crocodile> twoGenCrocodile = new GenericMethodsInGenericClassT<>();
        twoGenCrocodile.genericMethodTwoGenArgs(crocodileTwoGen, crocodileTwoGen);

        Crocodile crocodileHalfGen = new Crocodile(3, "text");
        GenericMethodsInGenericClassT<Crocodile> halfGenCrocodile = new GenericMethodsInGenericClassT<>();
        halfGenCrocodile.genericMethodHalfGenArgs(crocodileHalfGen, "very long text");
        System.out.println();

        System.out.println("Flower type: ");
        Flower flowerOneGen = new Flower(1);
        GenericMethodsInGenericClassT<Flower> oneGenFlower = new GenericMethodsInGenericClassT<>();
        oneGenFlower.genericMethodOneGenArg(flowerOneGen);

        Flower flowerTwoGen = new Flower(2);
        GenericMethodsInGenericClassT<Flower> twoGenFlower = new GenericMethodsInGenericClassT<>();
        twoGenFlower.genericMethodTwoGenArgs(flowerTwoGen, flowerTwoGen);

        Flower flowerHalfGen = new Flower(3);
        GenericMethodsInGenericClassT<Flower> halfGenFlower = new GenericMethodsInGenericClassT<>();
        halfGenFlower.genericMethodHalfGenArgs(flowerHalfGen, "very long text");
        System.out.println();

        System.out.println("Fly type: ");
        Fly flyOneGen = new Fly(1, "text");
        GenericMethodsInGenericClassT<Fly> oneGenFly = new GenericMethodsInGenericClassT<>();
        oneGenFly.genericMethodOneGenArg(flyOneGen);

        Fly flyTwoGen = new Fly(2, "text");
        GenericMethodsInGenericClassT<Fly> twoGenFly = new GenericMethodsInGenericClassT<>();
        twoGenFly.genericMethodTwoGenArgs(flyTwoGen, flyTwoGen);

        Fly flyHalfGen = new Fly(3, "text");
        GenericMethodsInGenericClassT<Fly> halfGenFly = new GenericMethodsInGenericClassT<>();
        halfGenFly.genericMethodHalfGenArgs(flyHalfGen, "very long text");
        System.out.println();
    }
}