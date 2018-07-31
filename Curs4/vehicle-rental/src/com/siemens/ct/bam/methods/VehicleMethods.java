package com.siemens.ct.bam.methods;

import com.siemens.ct.bam.exceptions.RegisterExceptions;
import com.siemens.ct.bam.objects.User;
import com.siemens.ct.bam.objects.Vehicle;

import java.util.*;
import java.util.stream.Collectors;

public class VehicleMethods implements com.siemens.ct.bam.interfaces.VehicleMethods {

    public  HashMap<String, Vehicle> registeredVehicles = new HashMap<>();
    public List<Vehicle> listToSort = new ArrayList<>();

    public void registerVehicle(Vehicle newVehicle) throws RegisterExceptions {

        if (registeredVehicles.containsKey(newVehicle.getCarNumber())) {
            String errorMessage = "The car with car number " + newVehicle.getCarNumber() + " already exists.";
            throw new RegisterExceptions(errorMessage);
        }

        registeredVehicles.put(newVehicle.getCarNumber(), newVehicle);
        listToSort.add(newVehicle);
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return listToSort;
    }

    @Override
    public List<Vehicle> getAllVehicleSortedByManufacturingYear() {

       return listToSort.stream().sorted(Comparator.comparing(Vehicle :: getManufacturingYear)).collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getAllVehicleSortedByBrand() {

        return listToSort.stream().sorted(((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()))).collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> searchByType(String type) {
        return listToSort.stream().filter(s -> s.getType().toString().equals(type)).collect(Collectors.toList());
    }

    @Override
    public Map<Vehicle, ArrayList<User>> getHistoric() {
        return null;
    }

    @Override
    public void rentVehicle(User user, Vehicle vehicle) {

    }

    @Override
    public List<Vehicle> getRentedVehiclesForAnUser(User user) {
        return null;
    }

}
