package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.Rent;
import com.siemens.ct.bam.models.User;
import com.siemens.ct.bam.models.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class InsertRentContractInDB {

    FindCar carFinder = new FindCar();
    FindUser userFinder = new FindUser();
    DBConnector dbConnector = new DBConnector();
    private Connection connection;

    public int addRentContractInDB(Rent rentContractToInsert) {
        connection = dbConnector.connect();

        int result = 0;
        String query = "INSERT INTO RENT (START_DATE, END_DATE, NUMBER_OF_KILOMETERS," +
                "ID_USER, ID_VEHICLE) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, rentContractToInsert.getStartDate());
            stmt.setString(2, rentContractToInsert.getEndDate());
            stmt.setInt(3, rentContractToInsert.getNumberOfKilometers());
            for (Map.Entry<Integer, User> user : userFinder.getUserFromDB(rentContractToInsert.getPersonalCode()).entrySet())
                stmt.setInt(4, user.getKey());
            for (Map.Entry<Integer, Vehicle> vehicle : carFinder.getVehicleFromDB(rentContractToInsert.getCarNumber()).entrySet())
                stmt.setInt(5, vehicle.getKey());
            result = stmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(stmt);
        }
        return result;
    }

}
