package cn.jdbc;

import java.sql.*;

/**
 * @author Hale Lv
 * @created 2021-02-27 08:02
 * @project Java2021
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://bigdata003/jdbc","root","halelv");
        String sql = "select * from user";
        Statement stmt = conn.createStatement();
        System.out.println(sql);
        System.out.println(stmt);
        ResultSet count = stmt.executeQuery(sql);
        System.out.println(count);
        boolean result = stmt.execute(sql);
        System.out.println(result);
        stmt.close();
        conn.close();
    }
}
