package lyc.java.javaSE;

import java.sql.*;

public class LJDBC {
    // JDBC连接的URL, 不同数据库有不同的格式:
    private String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8";
    private String JDBC_USER = "root";
    private String JDBC_PASSWORD = "lyc1415926";
    void testJDBC() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT name FROM students WHERE score<100")) {
                    System.out.println(rs);
               /*     while (rs.next()) {
                        long id = rs.getLong(1); // 注意：索引从1开始
                        long grade = rs.getLong(2);
                        String name = rs.getString(3);
                        String gender = rs.getString(4);
                    }*/
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
