package com.kosta.exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class FindStudentByName {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        ResultSet rs = null;
        ArrayList<String> result = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "c##madang",
                    "madang");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM STUDENT WHERE NAME = '" + name + "'";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                result = new ArrayList<>();
                for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    result.add(rs.getString(i));
                }
            }
            System.out.println(result.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if(rs!=null) {
                    rs.close();
                }
                if(stmt != null) {
                    stmt.close();
                }
                if(conn != null) {
                    conn.close();
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
