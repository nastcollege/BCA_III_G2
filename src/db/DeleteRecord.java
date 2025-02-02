package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            //taking user input
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Id");
            int studentId = in.nextInt();

            Connection con = MyDbConnection.connect();

            //statement
            String sql = "DELETE FROM tbl_Students WHERE id=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, studentId);

            //execute query
            int res = stm.executeUpdate();
            //close connection
            con.close();
            if(res>0){
                System.out.println("Delete Success");
            }else{
                System.out.println("Sorry, Unable to Delete");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
