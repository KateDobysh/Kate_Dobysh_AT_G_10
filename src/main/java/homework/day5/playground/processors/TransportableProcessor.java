package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.essence.craft.field.Vehicle;
import homework.day5.playground.utils.CoordinatesGenerator;
import homework.day5.playground.utils.DirectionGenerator;


public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        String print = String.format("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), distance);
        System.out.println(print);
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        int distance = transportable.move(pointA, pointB);
        String print = String.format("Transportable %s was moved to %d points", transportable.getClass().getSimpleName(), distance);
        System.out.println(print);
    }
}