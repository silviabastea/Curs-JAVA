package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUserInDB {

    DBConnector dbConnector = new DBConnector();
    private Connection connection;

    public int addUserInDB(User userToInsert) {

        connection = dbConnector.connect();

        int result = 0;
        String query = "INSERT INTO USERS (PERSONAL_CODE, FIRST_NAME, " +
                "LAST_NAME, GENDER, EMITTED_YEAR_DRIVING_LICENSE) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, userToInsert.getPersonalCode());
            stmt.setString(2, userToInsert.getFirstName());
            stmt.setString(3, userToInsert.getLastName());
            stmt.setString(4, userToInsert.getGender());
            stmt.setInt(5, userToInsert.getEmittedYearOfDrivingLicense());
            result = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(stmt);
        }
        return result;
    }
}
