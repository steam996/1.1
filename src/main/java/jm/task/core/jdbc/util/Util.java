package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/users";
    private final String LOGIN = "root";
    private final String PASSWORD = "root";
    private Connection connection;
    public Connection openConnection(){
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
