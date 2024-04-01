package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorDb {
    static Connection connection;

    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/voyajava";
        String userName = "root";
        String password = "root";
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("connection to Data Base");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
