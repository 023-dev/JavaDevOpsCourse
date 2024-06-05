package com.kosta.exam03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class StudentGUI extends JFrame {
    JTable table;
    Vector<String> colNames;
    Vector<Vector<String>> rowData;
    JTextField jtf_name;
    JTextField jtf_kor;
    JTextField jtf_eng;
    JTextField jtf_math;
    JPanel header = new JPanel();
    public StudentGUI() {
        header = new JPanel(new FlowLayout());
        jtf_name = new JTextField(10);
        jtf_kor = new JTextField(5);
        jtf_eng = new JTextField(5);
        jtf_math = new JTextField(5);

        header.add(new JLabel("이름"));
        header.add(jtf_name);
        header.add(new JLabel("국어"));
        header.add(jtf_kor);
        header.add(new JLabel("영어"));
        header.add(jtf_eng);
        header.add(new JLabel("수학"));
        header.add(jtf_math);

        JButton btnAdd= new JButton("등록");
        header.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());
                updateTable("INSERT INTO STUDENT VALUES('" + name + "'," + kor + "," + eng + "," + math + ")");
            }
        });
        JButton btnInquiry= new JButton("조회");
        header.add(btnInquiry);
        btnInquiry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jtf_name.getText();
                updateTable("SELECT * FROM STUDENT WHERE NAME = '" + name + "'," + kor + "," + eng + "," + math + ")");
            }
        });
        add(header, BorderLayout.NORTH);
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

        setSize(550, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table.addMouseListener(new MouseListener() {
            @Override public void mouseReleased(MouseEvent e) {
                updateTable("SELECT * FROM STUDENT WHERE NAME = '"+ rowData.get(table.getSelectedRow()).get(0)+ "'");}
            @Override public void mouseClicked(MouseEvent e) {}
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
        });

        btnRead.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {updateTable("SELECT * FROM STUDENT");}
        });

        updateTable("SELECT * FROM STUDENT");
    }
    public void updateTable(String query){
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
            boolean isResultSet = stmt.execute(query);
            rs = stmt.getResultSet();
            if(isResultSet){
                if(stmt.getMaxRows() == 1) {

                } else {
                    while (rs.next()) {
                        Vector<String> row = new Vector<>();
                        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                            row.add(rs.getString(i));
                        }
                        rowData.add((Vector) row);
                    }
                }
                table.updateUI();
            }else{
                updateTable("SELECT * FROM STUDENT");
            }
        }catch (Exception ex) { ex.printStackTrace();
        }finally {
            try {
                if( rs != null) rs.close();
                if( stmt != null)  stmt.close();
                if(conn != null) conn.close();
            }catch (Exception ex) {ex.printStackTrace();}
        }
    }
    public static void main(String[] args) {
        new StudentGUI();
    }
}