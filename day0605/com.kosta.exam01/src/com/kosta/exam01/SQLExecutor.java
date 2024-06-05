package com.kosta.exam01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLExecutor {
    String query;
    int result;
    ResultSet resultSet;
    public SQLExecutor(String query) {
        this.query = query;
        Connection conn = null;
        Statement stmt = null;
        try {
            //1. jdbc 드라이브를 메모리로 로드한다.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //2. DB 서버 연결 configuration
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "c##madang";
            String password = "madang";
            conn = DriverManager.getConnection(url, user, password);
            //3. DB 명령어 실행 담당자 객체를 생성한다.
            stmt = conn.createStatement();
            //4. 실행담당자를 통해서 데이터베이스 명령어를 실행한다.
            result = stmt.executeUpdate(query);
            resultSet = stmt.getResultSet();
            System.out.println(result);
        } catch (Exception e) {System.out.println(e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }catch (Exception e) {System.out.println(e.getMessage());}
        }
    }
}
