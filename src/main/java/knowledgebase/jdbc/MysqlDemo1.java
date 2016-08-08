package knowledgebase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Du on 16/7/25.
 */
public class MysqlDemo1 {

    public static void main(String[] args) throws Exception {
        // 动态加载mysql驱动
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        System.out.println("Load MySQL Driver succeed!!");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost" +
                "/mydemo?user=root&password=dudong0920&useUnicode=true&characterEncoding=UTF8");
        Statement statement = conn.createStatement();
        String sql = "CREATE TABLE student(NO char(20), name varchar(20), primary key(NO))";
        int result = statement.executeUpdate(sql);
        if (result != -1) {
            System.out.println("创建数据表成功");
            sql = "INSERT INTO student(NO, name) values('181818', '杜冬')";
            result = statement.executeUpdate(sql);
        }
    }

}
