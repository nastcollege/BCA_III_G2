package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateRecord {
    public static void main(String[] args) {
        try {

            //taking user input
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Id");
            int studentId = in.nextInt();

            Connection con = MyDbConnection.connect();

            //statement
            String sql = "SELECT * FROM tbl_Students WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, studentId);
            //execute query
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                System.out.print("NAME: " + rs.getString("first_name") + " " +
                        rs.getString("last_name"));
                System.out.print("\tEMAIL: " + rs.getString("email"));
                System.out.print("\tMOBILE: " + rs.getString("mobile"));
                System.out.println("\tSTATUS: " + rs.getString("status"));
            }



            //taking user input
            System.out.println("Enter First Name");
            String firstName = in.next();
            System.out.println("Enter Last Name");
            String lastName = in.next();
            System.out.println("Enter Email");
            String email = in.next();
            System.out.println("Enter Mobile Number");
            String mobile = in.next();
            in.close();



            //statement
            String sql1 = "UPDATE tbl_students SET first_name=?, last_name=?, email=?, mobile=?, status=? WHERE id=?";

            PreparedStatement stm1 = con.prepareStatement(sql1);
            stm1.setString(1, firstName);
            stm1.setString(2, lastName);
            stm1.setString(3, email);
            stm1.setString(4, mobile);
            stm1.setInt(5, 1);
            stm1.setInt(6, studentId);


            //execute query
            int res = stm1.executeUpdate();
            //close connection
            con.close();
            if(res>0){
                System.out.println("updated ");
            }else{
                System.out.println("Sorry, Unable to update");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
