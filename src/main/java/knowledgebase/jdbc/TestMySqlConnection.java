package knowledgebase.jdbc;

import java.sql.*;

/**
 * Created by Du on 16/7/24.
 */
public class TestMySqlConnection {

    public static void main(String[] args) {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=dudong0920");
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dept");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("deptno"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

}
