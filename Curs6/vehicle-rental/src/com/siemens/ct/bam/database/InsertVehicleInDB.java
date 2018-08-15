package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertVehicleInDB {

    DBConnector dbConnector = new DBConnector();
    private Connection connection;

    public int addVehicleInDB(Vehicle vehicleToInsert) {
        connection = dbConnector.connect();

        int result = 0;
        String query = "INSERT INTO VEHICLE (CAR_NUMBER, CAR_TYPE, " +
                "BRAND, MANUFACTURING_YEAR, COLOR) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, vehicleToInsert.getCarNumber());
            stmt.setString(2, vehicleToInsert.getType().toString());
            stmt.setString(3, vehicleToInsert.getBrand());
            stmt.setInt(4, vehicleToInsert.getManufacturingYear());
            stmt.setString(5, vehicleToInsert.getColor());
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(stmt);
        }
        return result;
    }
}
