package com.siemens.ct.bam.main;

import com.siemens.ct.bam.exceptions.RegisterExceptions;
import com.siemens.ct.bam.methods.VehicleMethods;
import com.siemens.ct.bam.objects.CarType;
import com.siemens.ct.bam.objects.Vehicle;

public class Main {

    public static void main(String[] args) throws RegisterExceptions {

        Vehicle vehicle1 = new Vehicle("BV 96 SLV", CarType.MASINA, "Audi",2012, "black");
        Vehicle vehicle2 = new Vehicle("BV 13 ABC", CarType.MASINA, "Volkswagen",2010, "pink");
        Vehicle vehicle3 = new Vehicle("BV 14 AAA", CarType.RULOTA, "Iveco",2014, "purple");
        Vehicle vehicle4 = new Vehicle("BV 15 BST", CarType.SCOOTER, "Honda",2016, "red");

        VehicleMethods methods = new VehicleMethods();

        methods.registerVehicle(vehicle1);
        methods.registerVehicle(vehicle2);
        methods.registerVehicle(vehicle3);
        methods.registerVehicle(vehicle4);

        for (Vehicle vehicles : methods.getAllVehicle())
        System.out.println(vehicles);
        




    }




}
