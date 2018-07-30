package com.siememns.ct.bam.main;

import objects.*;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Vehicle> allVehicle = new TreeSet<>();

        Vehicle vehicle1 = new Vehicle("Audi", 5, 300);
        Vehicle vehicle2 = new Vehicle("Volkswagen", 4, 250);

        Vehicle landVehicle1 = new LandVehicle("G-class", 5, 250, 4);
        Vehicle landVehicle2 = new LandVehicle("Yamaha", 2, 100, 4);

        Vehicle jeep1 = new Jeep("Duster", 4, 200, 4);
        Vehicle jeep2 = new Jeep("Q3", 5, 280, 4);

        Vehicle seaVessel1 = new SeaVessel("Ajax", 30, 150, "South");
        Vehicle seaVessel2 = new SeaVessel("Calcutta", 20, 120, "North");

        Vehicle frigate1 = new Frigate("Brazen", 200, 100, "South");
        Vehicle frigate2 = new Frigate("Brilliant", 300, 120, "West");


        ((LandVehicle) vehicle1).drive();
        ((LandVehicle) vehicle2).drive();
        ((LandVehicle) landVehicle1).drive();
        ((LandVehicle) landVehicle2).drive();
        ((LandVehicle) jeep1).drive();
        ((LandVehicle) jeep2).drive();

        ((Frigate) vehicle1).fireGun();
        ((Frigate) vehicle2).fireGun();
        ((Frigate) seaVessel1).fireGun();
        ((Frigate) seaVessel2).fireGun();
        ((Frigate) frigate1).fireGun();
        ((Frigate) frigate2).fireGun();


        allVehicle.add(vehicle1);
        allVehicle.add(vehicle2);
        allVehicle.add(landVehicle1);
        allVehicle.add(landVehicle2);
        allVehicle.add(jeep1);
        allVehicle.add(jeep2);
        allVehicle.add(seaVessel1);
        allVehicle.add(seaVessel2);
        allVehicle.add(frigate1);
        allVehicle.add(frigate2);

        for (Object objectsFromSet : allVehicle) {
            System.out.println(objectsFromSet);
        }


    }
}
