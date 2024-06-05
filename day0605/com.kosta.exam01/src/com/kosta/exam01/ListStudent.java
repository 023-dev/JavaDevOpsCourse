package com.kosta.exam01;

import java.rmi.server.ExportException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudent {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "c##madang";
            String password = "madang";
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            int result = stmt.executeUpdate("Select * from STUDENT");
            ResultSet rs = stmt.getResultSet();
            System.out.printf("\t%s\t|\t%s\t|\t%s\t|\t%s\n", "name", "kor", "eng", "math");
            while (rs.next()){
                String name = rs.getString(1);
                int kor = rs.getInt(2);
                int eng = rs.getInt(3);
                int math = rs.getInt(4);
                System.out.printf("\t%s\t|\t%d\t|\t%d\t|\t%d\n",name, kor, eng, math);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(stmt!=null)stmt.close();
                if(conn!=null)conn.close();
            } catch ( Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
