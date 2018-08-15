package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class FindUser {

    DBConnector dbConnector = new DBConnector();
    private Connection connection;

    public HashMap<Integer, User> getUserFromDB(String personalCode) {
        String query = "SELECT * FROM USERS WHERE PERSONAL_CODE = ?";

        HashMap<Integer, User> userForCurrentPersonalCode = new HashMap<>();
        User userFromDB = new User();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        connection = dbConnector.connect();

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, personalCode);

            rs = stmt.executeQuery();

            while (rs.next()) {
                userFromDB.setPersonalCode(rs.getString("PERSONAL_CODE"));
                userFromDB.setFirstName(rs.getString("FIRST_NAME"));
                userFromDB.setLastName(rs.getString("LAST_NAME"));
                userFromDB.setGender(rs.getString("GENDER"));
                userFromDB.setEmittedYearOfDrivingLicense(rs.getInt("EMITTED_YEAR_DRIVING_LICENSE"));
                userForCurrentPersonalCode.put(rs.getInt("ID"), userFromDB);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(rs, stmt);
        }

        return userForCurrentPersonalCode;
    }
}
