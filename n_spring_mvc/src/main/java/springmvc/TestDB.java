package springmvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/springDb?useSSL=false&serverTimezone=UTC",
                "root", "mysql"
        );
        System.out.println("Connection successful!");
        conn.close();
    }
}
