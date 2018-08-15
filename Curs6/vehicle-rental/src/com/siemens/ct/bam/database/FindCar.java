package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.CarType;
import com.siemens.ct.bam.models.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class FindCar {

    DBConnector dbConnector = new DBConnector();
    private Connection connection;

    public HashMap<Integer, Vehicle> getVehicleFromDB(String carNumber) {
        String querry = "SELECT * FROM VEHICLE WHERE CAR_NUMBER = ?";

        HashMap<Integer, Vehicle> carForCurrentCarNumber = new HashMap<>();
        Vehicle vehicleFromDB = new Vehicle();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        connection = dbConnector.connect();

        try {
            stmt = connection.prepareStatement(querry);
            stmt.setString(1, carNumber);

            rs = stmt.executeQuery();

            while (rs.next()) {
                vehicleFromDB.setCarNumber(rs.getString("CAR_NUMBER"));
                vehicleFromDB.setType(CarType.valueOf(rs.getString("CAR_TYPE")));
                vehicleFromDB.setBrand(rs.getString("BRAND"));
                vehicleFromDB.setManufacturingYear(rs.getInt("MANUFACTURING_YEAR"));
                vehicleFromDB.setColor(rs.getString("COLOR"));
                carForCurrentCarNumber.put(rs.getInt("ID"), vehicleFromDB);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(rs, stmt);
        }
        return carForCurrentCarNumber;
    }


    public HashMap<Integer, Vehicle> getVehicleFromDB(Integer id) {
        String querry = "SELECT * FROM VEHICLE WHERE ID = ?";

        HashMap<Integer, Vehicle> carForCurrentCarNumber = new HashMap<>();
        Vehicle vehicleFromDB = new Vehicle();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        connection = dbConnector.connect();

        try {
            stmt = connection.prepareStatement(querry);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            while (rs.next()) {
                vehicleFromDB.setCarNumber(rs.getString("CAR_NUMBER"));
                vehicleFromDB.setType(CarType.valueOf(rs.getString("CAR_TYPE")));
                vehicleFromDB.setBrand(rs.getString("BRAND"));
                vehicleFromDB.setManufacturingYear(rs.getInt("MANUFACTURING_YEAR"));
                vehicleFromDB.setColor(rs.getString("COLOR"));
                carForCurrentCarNumber.put(rs.getInt("ID"), vehicleFromDB);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(rs, stmt);
        }
        return carForCurrentCarNumber;
    }
}
