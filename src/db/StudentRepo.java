package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudentRepo implements StudentCrud{

    @Override
    public int saveStudentInfo(String firstName, String lastName, String email, String mobile) throws Exception {

        Connection conn =MyDbConnection.connect();

        //statement
        String sql = "INSERT INTO tbl_students(first_name, last_name, email, mobile) VALUES(?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, firstName);
        stmt.setString(2, lastName);
        stmt.setString(3, email);
        stmt.setString(4, mobile);

        //execute
        return stmt.executeUpdate();
    }

    @Override
    public int updateStudentInfo(Integer id, String firstName, String lastName, String email, String mobile) throws Exception {
        Connection conn = MyDbConnection.connect();

        //statement
        String sql = "UPDATE tbl_students SET first_name=?, last_name=?, email=?, mobile=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, firstName);
        stmt.setString(2, lastName);
        stmt.setString(3, email);
        stmt.setString(4, mobile);
        stmt.setInt(5,id);

        //execute

        return stmt.executeUpdate();

    }

    @Override
    public int deleteStudentInfo(Integer id) throws Exception {
        //database connection
        Connection conn = MyDbConnection.connect();

        //statement
        String sql = "DELETE FROM tbl_students WHERE id=?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1,id);

        //execute

        return stmt.executeUpdate();
    }

    @Override
    public ResultSet selectAllStudentInfo() throws Exception {
        //database connection
        Connection conn =MyDbConnection.connect();

        //statement
        String sql = "SELECT * FROM tbl_students";
        PreparedStatement stmt = conn.prepareStatement(sql);

        return stmt.executeQuery();
    }

    @Override
    public ResultSet selectStudentById(Integer id) throws Exception {
        //database connection
        Connection conn =MyDbConnection.connect();

        //statement
        String sql = "SELECT * FROM tbl_students WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1,id);

        return stmt.executeQuery();
    }


}
