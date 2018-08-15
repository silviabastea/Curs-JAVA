package com.siemens.ct.bam.database;

import com.siemens.ct.bam.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadUsersFromDB {

    DBConnector dbConnector = new DBConnector();
    private Connection connection;

    public ArrayList<User> getUsersFromDB() {
        String query = "SELECT PERSONAL_CODE, FIRST_NAME, LAST_NAME, GENDER, EMITTED_YEAR_DRIVING_LICENSE FROM USERS";

        ArrayList<User> usersFromDB = new ArrayList();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        connection = dbConnector.connect();

        try {
            stmt = connection.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                User userFromDB = new User();
                userFromDB.setPersonalCode(rs.getString("PERSONAL_CODE"));
                userFromDB.setFirstName(rs.getString("FIRST_NAME"));
                userFromDB.setLastName(rs.getString("LAST_NAME"));
                userFromDB.setGender(rs.getString("GENDER"));
                userFromDB.setEmittedYearOfDrivingLicense(rs.getInt("EMITTED_YEAR_DRIVING_LICENSE"));
                usersFromDB.add(userFromDB);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnector.closeResources(rs, stmt);
        }

        return usersFromDB;
    }
}
