package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.User;
import com.siemens.ct.bam.models.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class FindRentCars {
    DBConnector dbConnector = new DBConnector();
    FindUser userFinder = new FindUser();
    FindCar carFinder = new FindCar();
    private Connection connection;

    public ArrayList<Vehicle> getRentCarsForCurrentUser(User user) {
        String query = "SELECT ID_VEHICLE FROM RENT WHERE ID_USER = ?";

        ArrayList<Vehicle> rentCars = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        connection = dbConnector.connect();

        try {
            stmt = connection.prepareStatement(query);

            for (Map.Entry<Integer, User> userMap : userFinder.getUserFromDB(user.getPersonalCode()).entrySet())
                stmt.setInt(1, userMap.getKey());
            rs = stmt.executeQuery();

            while (rs.next()) {
                for (Map.Entry<Integer, Vehicle> vehicle : carFinder.getVehicleFromDB(rs.getInt("ID_VEHICLE")).entrySet())
                    rentCars.add(vehicle.getValue());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(rs, stmt);
        }

        return rentCars;
    }
}
