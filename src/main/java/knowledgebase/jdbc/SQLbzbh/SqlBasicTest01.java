package knowledgebase.jdbc.SQLbzbh;

import knowledgebase.jdbc.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SQL 必知必会
 * Created by Du on 16/8/9.
 */
public class SqlBasicTest01 {

    public static void main(String[] args) {
//        query01();
//        query02();
        queryUserBetween();
    }

    static void query01() {
        Connection connection = DBUtil.open();

        String sql = "SELECT prod_name,prod_price FROM products WHERE prod_price < 8";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String prodName = resultSet.getString(1);
                double price = resultSet.getDouble(2);

                System.out.println("Product : " + prodName + ", Price: " + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 不匹配查询
     */
    static void query02() {
        Connection connection = DBUtil.open();

        String sql = "SELECT vend_id,prod_name FROM products WHERE vend_id <> 'DLL01'";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String vend_id = resultSet.getString(1);
                String prod_name = resultSet.getString(2);

                System.out.println("Vend_id: " + vend_id + ", Prod_name: " + prod_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *  BETWEEN 查询
     */
    static void queryUserBetween() {
        Connection connection = DBUtil.open();

        String sql = "SELECT prod_name,prod_price FROM products WHERE prod_price " +
                "BETWEEN 5 AND 8.989";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String prod_name = resultSet.getString(1);
                String prod_price = resultSet.getString(2);

                System.out.println("prod_price: " + prod_price + ", Prod_name: " + prod_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
