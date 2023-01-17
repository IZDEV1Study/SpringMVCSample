package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Logger;

public class DepartmentDAO {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String id = "C##TEMPUSER";
    String pw = "qwer1234";

    public DepartmentDAO(){
    }

    public ArrayList<Department> selectList(){
        ArrayList<Department> list = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, id, pw);
            Statement stmt = conn.createStatement();

            String sql = "select * from iz_team";

            rs = stmt.executeQuery(sql);

            list = new ArrayList<>();
            while (rs.next()){
                String name = rs.getString("name");
                int peopleCount = rs.getInt("peopleCount");
                String role = rs.getString("role");

                Department department = new Department(name, peopleCount, role);
                list.add(department);
            }
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                rs.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return list;
    }
}
