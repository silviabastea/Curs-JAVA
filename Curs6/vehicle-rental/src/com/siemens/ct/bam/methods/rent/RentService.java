package com.siemens.ct.bam.methods.rent;

import com.siemens.ct.bam.database.FindRentCars;
import com.siemens.ct.bam.database.InsertRentContractInDB;
import com.siemens.ct.bam.database.ReadUsersFromDB;
import com.siemens.ct.bam.interfaces.RentMethods;
import com.siemens.ct.bam.models.Rent;
import com.siemens.ct.bam.models.User;
import com.siemens.ct.bam.models.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentService implements RentMethods {

    @Override
    public Map<User, ArrayList<Vehicle>> getHistoric() {
        ReadUsersFromDB reader = new ReadUsersFromDB();
        FindRentCars finder = new FindRentCars();

        HashMap<User, ArrayList<Vehicle>> historic = new HashMap<>();

        for (User user : reader.getUsersFromDB())
            historic.put(user, finder.getRentCarsForCurrentUser(user));

        return historic;
    }

    @Override
    public void rentVehicle(Rent rentContractToInsert) {
        InsertRentContractInDB insert = new InsertRentContractInDB();
        insert.addRentContractInDB(rentContractToInsert);
    }

    @Override
    public List<Vehicle> getRentedVehiclesForAnUser(User user) {
        FindRentCars finder = new FindRentCars();
        return finder.getRentCarsForCurrentUser(user);
    }


}
