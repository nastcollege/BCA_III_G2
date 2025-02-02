package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            //taking user input
            Scanner in = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName = in.next();
            System.out.println("Enter Last Name");
            String lastName = in.next();
            System.out.println("Enter Email");
            String email = in.next();
            System.out.println("Enter Mobile Number");
            String mobile = in.next();
            in.close();

            Connection con = MyDbConnection.connect();

            //statement
            String sql = "INSERT INTO  tbl_students(first_name, last_name, email, mobile, status) VALUES(?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, firstName);
            stm.setString(2, lastName);
            stm.setString(3, email);
            stm.setString(4, mobile);
            stm.setInt(5, 1);

            //execute query
            int res = stm.executeUpdate();
            //close connection
            con.close();
            if(res>0){
                System.out.println("Saved Success");
            }else{
                System.out.println("Sorry, Unable to Save");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
