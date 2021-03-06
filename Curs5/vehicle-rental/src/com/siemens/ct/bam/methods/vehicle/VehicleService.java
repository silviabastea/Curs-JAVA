package com.siemens.ct.bam.methods.vehicle;

import com.siemens.ct.bam.methods.vehicle.ReadVehiclesFromFile;
import com.siemens.ct.bam.models.User;
import com.siemens.ct.bam.models.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VehicleService implements com.siemens.ct.bam.interfaces.VehicleMethods {


    ReadVehiclesFromFile reader = new ReadVehiclesFromFile();

    @Override
    public List<Vehicle> getAllVehicle() {
        return reader.getVehicleFromFile();
    }

    @Override
    public List<Vehicle> getAllVehicleSortedByManufacturingYear() {

        return reader.getVehicleFromFile().stream().sorted(Comparator.comparing(Vehicle::getManufacturingYear)).collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getAllVehicleSortedByBrand() {

        return reader.getVehicleFromFile().stream().sorted(((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()))).collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> searchByType(String type) {
        return reader.getVehicleFromFile().stream().filter(s -> s.getType().toString().equals(type)).collect(Collectors.toList());
    }

    @Override
    public Map<Vehicle, ArrayList<User>> getHistoric() {
        return null;
    }

    @Override
    public void rentVehicle(User user, Vehicle vehicle) {

    }

    @Override
    public List<Vehicle> getRentedVehiclesForAnUser(User user) { return null; }

}
