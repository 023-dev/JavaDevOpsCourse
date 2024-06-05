package com.kosta.exam02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.*;

public class StudentGUI extends JFrame {
    JTable table;
    Vector<String> colNames;
    Vector<Vector<String>> rowData;

    public StudentGUI() {
        colNames = new Vector<String>();
        colNames.add("이름");
        colNames.add("국어");
        colNames.add("영어");
        colNames.add("수학");

        rowData = new Vector<Vector<String>>();//Vector is child of List
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);
        JPanel p= new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton btnRead = new JButton("읽어오기");
        p.add(btnRead);

        add(jsp, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnRead.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "select * from student";
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                rowData.clear();
                try {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conn = DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:XE",
                            "c##madang",
                            "madang");
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        Vector<String> row = new Vector<>();
                        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                            row.add(rs.getString(i));
                        }
                        rowData.add((Vector)row);
                    }
                    table.updateUI();

                }catch (Exception ex) {
                    System.out.println("예외발생:"+ex.getMessage());
                }finally {
                    try {
                        if( rs != null) {
                            rs.close();
                        }

                        if( stmt != null) {
                            stmt.close();
                        }

                        if(conn != null) {
                            conn.close();
                        }
                    }catch (Exception ex) {
                        // TODO: handle exception
                    }
                }
            }
        });

    }

    public static void main(String[] args) {
        new StudentGUI();

    }
}