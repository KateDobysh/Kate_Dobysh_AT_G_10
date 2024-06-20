package homework.day6;

import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.Car;
import homework.day5.playground.essence.craft.field.Moped;
import homework.day5.playground.essence.craft.field.Motorbike;
import homework.day5.playground.essence.craft.hand.Bottle;
import homework.day5.playground.essence.craft.hand.Can;
import homework.day5.playground.essence.craft.hand.Mug;
import homework.day5.playground.essence.creatures.*;
import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Water;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> twoGen = new GenericMethodsInGenericClassTwoParams<>();
        twoGen.genericMethodGenArgs("Two", "Strings");
        System.out.println();

        GenericMethodsInGenericClassTwoParams<String, Integer> twoGen1 = new GenericMethodsInGenericClassTwoParams<>();
        twoGen1.genericMethodGenArgs("Two", 20);
        System.out.println();

        GenericMethodsInGenericClassTwoParams<String, Double> twoGen2 = new GenericMethodsInGenericClassTwoParams<>();
        twoGen2.genericMethodGenArgs("Two", 25.2);
        System.out.println();

        GenericMethodsInGenericClassTwoParams<Integer, Integer> twoGen3 = new GenericMethodsInGenericClassTwoParams<>();
        twoGen3.genericMethodGenArgs(1, 5);
        System.out.println();

        System.out.println("Copter:");
        Copter copter = new Copter(1, "copter works");
        GenericMethodsInGenericClassTwoParams<Copter, Copter> twoGenCopter = new GenericMethodsInGenericClassTwoParams<>();
        twoGenCopter.genericMethodGenArgs(copter);
        System.out.println();

        System.out.println("Plane:");
        Plane plane = new Plane(1, "Plane works");
        GenericMethodsInGenericClassTwoParams<Plane, Plane> twoOnePlane = new GenericMethodsInGenericClassTwoParams<>();
        twoOnePlane.genericMethodGenArgs(plane);
        System.out.println();

        System.out.println("Rocket:");
        Rocket rocket = new Rocket(1, "Rocket works");
        GenericMethodsInGenericClassTwoParams<Rocket, Rocket> twoOneRocket = new GenericMethodsInGenericClassTwoParams<>();
        twoOneRocket.genericMethodHalfGenArgs(rocket, "string");
        System.out.println();

        System.out.println("Car:");
        Car car = new Car(1, "Car works");
        GenericMethodsInGenericClassTwoParams<Car, Car> twoOneCar = new GenericMethodsInGenericClassTwoParams<>();
        twoOneCar.genericMethodHalfGenArgs(car, "text here");
        System.out.println();

        System.out.println("Moped:");
        Moped moped = new Moped(1, "moped works");
        GenericMethodsInGenericClassTwoParams<Moped, Moped> twoOneMoped = new GenericMethodsInGenericClassTwoParams<>();
        twoOneMoped.genericMethodHalfGenArgs(moped, "string");
        System.out.println();

        System.out.println("Motorbike:");
        Motorbike motorbike = new Motorbike(1, "motorbike works");
        GenericMethodsInGenericClassTwoParams<Motorbike, Motorbike> twoOneMotorbike = new GenericMethodsInGenericClassTwoParams<>();
        twoOneMotorbike.genericMethodHalfGenArgs(motorbike, "string");
        System.out.println();

        System.out.println("Bottle:");
        Bottle bottle = new Bottle(1, "bottle works", "text");
        GenericMethodsInGenericClassTwoParams<Bottle, Bottle> twoGenBottle = new GenericMethodsInGenericClassTwoParams<>();
        twoGenBottle.genericMethodGenArgs(bottle);
        System.out.println();

        System.out.println("Can:");
        Can can = new Can(1, "Plane works", "texts");
        GenericMethodsInGenericClassTwoParams<Can, Can> twoOneCan = new GenericMethodsInGenericClassTwoParams<>();
        twoOneCan.genericMethodGenArgs(can);
        System.out.println();

        System.out.println("Mug:");
        Mug mug = new Mug(1, "Mug works", "string");
        GenericMethodsInGenericClassTwoParams<Mug, Mug> twoOneMug = new GenericMethodsInGenericClassTwoParams<>();
        twoOneMug.genericMethodHalfGenArgs(mug, "string");
        System.out.println();

        System.out.println("Beetle:");
        Beetle beetle = new Beetle(1, "Car works");
        GenericMethodsInGenericClassTwoParams<Beetle, Beetle> twoOneBeetle = new GenericMethodsInGenericClassTwoParams<>();
        twoOneBeetle.genericMethodHalfGenArgs(beetle, "text here");
        System.out.println();

        System.out.println("Carrot:");
        Carrot carrot = new Carrot(1, "carrot works");
        GenericMethodsInGenericClassTwoParams<Carrot, Carrot> twoOneCarrot = new GenericMethodsInGenericClassTwoParams<>();
        twoOneCarrot.genericMethodHalfGenArgs(carrot, "string");
        System.out.println();

        System.out.println("Chamomile:");
        Chamomile chamomile = new Chamomile(1, "chamomile works");
        GenericMethodsInGenericClassTwoParams<Chamomile, Chamomile> twoOneChamomile = new GenericMethodsInGenericClassTwoParams<>();
        twoOneChamomile.genericMethodHalfGenArgs(chamomile, "testts");
        System.out.println();

        System.out.println("Crocodile:");
        Crocodile crocodile = new Crocodile(1, "Crocodile works");
        GenericMethodsInGenericClassTwoParams<Crocodile, Crocodile> twoOneCrocodile = new GenericMethodsInGenericClassTwoParams<>();
        twoOneCrocodile.genericMethodHalfGenArgs(crocodile, "testts");
        System.out.println();

        System.out.println("Flower:");
        Flower flower = new Flower(1);
        GenericMethodsInGenericClassTwoParams<Flower, Flower> twoOneFlower = new GenericMethodsInGenericClassTwoParams<>();
        twoOneFlower.genericMethodHalfGenArgs(flower, "testts");
        System.out.println();

        System.out.println("Fly:");
        Fly fly = new Fly(1, "Fly works");
        GenericMethodsInGenericClassTwoParams<Fly, Fly> twoOneFly = new GenericMethodsInGenericClassTwoParams<>();
        twoOneFly.genericMethodHalfGenArgs(fly, "testts");
        System.out.println();

        System.out.println("Maylily:");
        Maylily maylily = new Maylily(1, "Maylily works");
        GenericMethodsInGenericClassTwoParams<Maylily, Maylily> twoOneMaylily = new GenericMethodsInGenericClassTwoParams<>();
        twoOneMaylily.genericMethodHalfGenArgs(maylily, "testts");
        System.out.println();

        System.out.println("Mosquito:");
        Mosquito mosquito = new Mosquito(1, "Mosquito works");
        GenericMethodsInGenericClassTwoParams<Mosquito, Mosquito> twoOneMosquito = new GenericMethodsInGenericClassTwoParams<>();
        twoOneMosquito.genericMethodHalfGenArgs(mosquito, "testts");
        System.out.println();

        System.out.println("Pigeon:");
        Pigeon pigeon = new Pigeon(1, "Pigeon works");
        GenericMethodsInGenericClassTwoParams<Pigeon, Pigeon> twoOnePigeon = new GenericMethodsInGenericClassTwoParams<>();
        twoOnePigeon.genericMethodHalfGenArgs(pigeon, "testts");
        System.out.println();

        System.out.println("Potato:");
        Potato potato = new Potato(1, "Potato works");
        GenericMethodsInGenericClassTwoParams<Potato, Potato> twoOnePotato = new GenericMethodsInGenericClassTwoParams<>();
        twoOnePotato.genericMethodHalfGenArgs(potato, "testts");
        System.out.println();

        System.out.println("Radish:");
        Radish radish = new Radish(1, "Radish works");
        GenericMethodsInGenericClassTwoParams<Radish, Radish> twoOneRadish = new GenericMethodsInGenericClassTwoParams<>();
        twoOneRadish.genericMethodHalfGenArgs(radish, "testts");
        System.out.println();

        System.out.println("Rose:");
        Rose rose = new Rose(1, "Rose works");
        GenericMethodsInGenericClassTwoParams<Rose, Rose> twoOneRose = new GenericMethodsInGenericClassTwoParams<>();
        twoOneRose.genericMethodHalfGenArgs(rose, "testts");
        System.out.println();

        System.out.println("Diesel:");
        Diesel diesel = new Diesel("text");
        GenericMethodsInGenericClassTwoParams<Diesel, Diesel> twoOneDiesel = new GenericMethodsInGenericClassTwoParams<>();
        twoOneDiesel.genericMethodHalfGenArgs(diesel, "testts");
        System.out.println();

        System.out.println("Petrol:");
        Petrol petrol = new Petrol("text");
        GenericMethodsInGenericClassTwoParams<Petrol, Petrol> twoOnePetrol = new GenericMethodsInGenericClassTwoParams<>();
        twoOnePetrol.genericMethodHalfGenArgs(petrol, "sdd");
        System.out.println();

        System.out.println("Water:");
        Water water = new Water("text");
        GenericMethodsInGenericClassTwoParams<Water, Water> twoOneWater = new GenericMethodsInGenericClassTwoParams<>();
        twoOneWater.genericMethodHalfGenArgs(water, "sdd");
        System.out.println();
    }
}
