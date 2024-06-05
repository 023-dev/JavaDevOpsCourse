package com.kosta.exam01;

import javax.swing.*;

public class JTableTest extends JFrame {
    JTable table;
    public JTableTest() {
        String[] colNames = {"이름", "국어", "영어", "수학"};
        String[][] rowData = {
                {"","","",""},
                {"","","",""},
                {"","","",""},
        };
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTableTest::new);
    }
}
