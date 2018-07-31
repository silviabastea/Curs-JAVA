package com.siemens.ct.bam.methods;

import com.siemens.ct.bam.objects.CarType;
import com.siemens.ct.bam.objects.Vehicle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadVehiclesFromFile {


    String FILE_NAME = "vehicles.txt";
    List<Vehicle> vehiclesFromFile = new ArrayList<>();
    BufferedReader br;

    public List<Vehicle> getVehicleFromFile() {
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            String lineFromFile;

            while ((lineFromFile = br.readLine()) != null) {
                String[] vehicleProperties = lineFromFile.split(",");
                Vehicle vehicle = new Vehicle(vehicleProperties[0].trim(), CarType.valueOf(vehicleProperties[1].trim()), vehicleProperties[2].trim(), Integer.parseInt(vehicleProperties[3].trim()), vehicleProperties[4].trim());
                vehiclesFromFile.add(vehicle);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vehiclesFromFile;
    }
}

