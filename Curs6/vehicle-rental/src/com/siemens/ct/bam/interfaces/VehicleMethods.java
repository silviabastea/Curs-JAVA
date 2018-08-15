package com.siemens.ct.bam.interfaces;

import com.siemens.ct.bam.models.Vehicle;

import java.util.List;

public interface VehicleMethods {
    List<Vehicle> getAllVehicle();

    List<Vehicle> getAllVehicleSortedByManufacturingYear();

    List<Vehicle> getAllVehicleSortedByBrand();

    List<Vehicle> searchByType(String type);

}
