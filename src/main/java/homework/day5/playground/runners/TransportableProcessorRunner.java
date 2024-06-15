package homework.day5.playground.runners;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.Transportable;
import homework.day5.playground.essence.craft.air.AirCraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.craft.field.*;
import homework.day5.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args){
        TransportableProcessor runAll = new TransportableProcessor();
        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        AirCraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        AirCraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        AirCraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        runAll.runTransportable(transportableCopter);
        runAll.runTransportable(transportablePlane);
        runAll.runTransportable(transportableRocket);
        runAll.runTransportable(transportableCar);
        runAll.runTransportable(transportableMoped);
        runAll.runTransportable(transportableMotorbike);
//        runAll.runTransportable(aircraftCopter);
//        runAll.runTransportable(aircraftPlane);
//        runAll.runTransportable(aircraftRocket);
        runAll.runTransportable(vehicleCar);
        runAll.runTransportable(vehicleMoped);
        runAll.runTransportable(vehicleMotorbike);

// runTransportable не смог принять на вход объекты
//        runAll.runTransportable(flyableCopter);
//        runAll.runTransportable(flyablePlane);
//        runAll.runTransportable(flyableRocket);
//        runAll.runTransportable(rideableCar);
//        runAll.runTransportable(rideableMoped);
//        runAll.runTransportable(rideableMotorbike);

        runAll.runTransportable(aCopter);
        runAll.runTransportable(aPlane);
        runAll.runTransportable(aRocket);
        runAll.runTransportable(aCar);
        runAll.runTransportable(aMoped);
        runAll.runTransportable(aMotorbike);

        runAll.runTransportable(transportableCar,23, 242);
        runAll.runTransportable(transportableMotorbike,93, 7);
    }
}
