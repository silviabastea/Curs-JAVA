package com.siemens.ct.bam.methods;

import com.siemens.ct.bam.exceptions.RegisterExceptions;
import com.siemens.ct.bam.objects.User;
import com.siemens.ct.bam.objects.Vehicle;
import java.util.*;

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

        Collections.sort(listToSort, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                if(o1.getManufacturingYear() == o2.getManufacturingYear())
                    return 0;
                else if (o1.getManufacturingYear() < o2.getManufacturingYear())
                    return -1;
                return 1;
            }
        });
        return listToSort;
    }

    @Override
    public List<Vehicle> getAllVehicleSortedByBrand() {

        Collections.sort(listToSort, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
              int cmp;
              return cmp = o1.getBrand().compareTo(o2.getBrand());
            }
        });
        return listToSort;

    }

    @Override
    public List<Vehicle> searchByType(String type) {
        List<Vehicle> specifiedTypeVehicles = new ArrayList<>();
        for (Vehicle vehicleFromList : listToSort)
            if(vehicleFromList.getType().toString().equals(type))
                specifiedTypeVehicles.add(vehicleFromList);
            return specifiedTypeVehicles;

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
