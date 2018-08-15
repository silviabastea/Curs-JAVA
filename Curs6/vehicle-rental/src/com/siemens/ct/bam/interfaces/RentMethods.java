package com.siemens.ct.bam.interfaces;

import com.siemens.ct.bam.models.Rent;
import com.siemens.ct.bam.models.User;
import com.siemens.ct.bam.models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface RentMethods {

    Map<User, ArrayList<Vehicle>> getHistoric();

    void rentVehicle(Rent rentContractToInset);

    List<Vehicle> getRentedVehiclesForAnUser(User user);
}
