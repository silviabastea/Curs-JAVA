package com.siemens.ct.bam.interfaces;

import com.siemens.ct.bam.objects.User;
import com.siemens.ct.bam.objects.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface VehicleMethods {
    List<Vehicle> getAllVehicle();

    List<Vehicle> getAllVehicleSortedByManufacturingYear();

    List<Vehicle> getAllVehicleSortedByBrand();

    List<Vehicle> searchByType(String type);

    Map<Vehicle, ArrayList<User>> getHistoric();

    void rentVehicle(User user, Vehicle vehicle);

    List<Vehicle> getRentedVehiclesForAnUser(User user);
}
