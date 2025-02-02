package db;

import java.sql.ResultSet;

public interface StudentCrud{
    public int saveStudentInfo(String firstName, String lastName, String email, String mobile) throws Exception;
    public int updateStudentInfo(Integer id, String firstName, String lastName, String email, String mobile) throws Exception;
    public int deleteStudentInfo(Integer id) throws Exception;
    public ResultSet selectAllStudentInfo() throws Exception;
    public  ResultSet selectStudentById(Integer id) throws Exception;
}