package db;

import java.sql.Connection;
import java.sql.DriverManager;

//import
public class MyDbConnection {
    public static void main(String[] args) {
        try {
            MyDbConnection.connect();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public static Connection connect() throws Exception {
        //loading database driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("loaded success...");

        //database connection
        Connection conn =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/db_bca_iii_g2",
                        "root",
                        "");
        System.out.println("Db Connected");
        return conn;
    }
}
