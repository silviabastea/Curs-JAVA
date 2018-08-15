package com.siemens.ct.bam.database;

import java.sql.*;

public class DBConnector {

    private final String HOST = "jdbc:sqlserver://127.0.0.1:1433";
    private final String DB_NAME = "VehicleRental";
    private final String DB_URL = "jdbc:sqlserver://127.0.0.1:1433;integratedSecurity=true;databaseName=VehicleRental";
    private Connection connection = null;


    public Connection connect() {
        try {
            connection = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeResources(ResultSet resultSet, Statement statement) {
        try {
            if (resultSet != null)
                resultSet.close();

            if (statement != null)
                statement.close();

            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeResources(Statement statement) {
        try {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
