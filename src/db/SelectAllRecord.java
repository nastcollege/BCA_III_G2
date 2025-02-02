package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectAllRecord {
    public static void main(String[] args) {
        try {


            Connection con = MyDbConnection.connect();

            //statement
            String sql = "SELECT * FROM tbl_Students";
            PreparedStatement stm = con.prepareStatement(sql);

            //execute query
            ResultSet rs= stm.executeQuery();
            while(rs.next()){
                System.out.print("NAME: "+rs.getString("first_name") + " "+
                        rs.getString("last_name"));
                System.out.print("\tEMAIL: "+rs.getString("email"));
                System.out.print("\tMOBILE: "+rs.getString("mobile"));
                System.out.println("\tSTATUS: "+rs.getString("status"));
            }
            //close connection
            con.close();


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
