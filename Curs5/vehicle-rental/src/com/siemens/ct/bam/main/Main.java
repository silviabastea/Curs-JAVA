package com.siemens.ct.bam.main;

import com.siemens.ct.bam.exceptions.RegisterExceptions;
import com.siemens.ct.bam.methods.VehicleMethods;
import com.siemens.ct.bam.objects.Vehicle;

public class Main {

    public static void main(String[] args) throws RegisterExceptions {

        VehicleMethods methods = new VehicleMethods();

        for (Vehicle vehicles : methods.getAllVehicleSortedByManufacturingYear())
            System.out.println(vehicles);


    }


}
