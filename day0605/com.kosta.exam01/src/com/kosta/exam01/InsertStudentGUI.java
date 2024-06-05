//package com.kosta.exam01;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.util.Vector;
//
//public class InsertStudentGUI extends JFrame {
//    JButton insertButton;
//    JButton inquiryButton;
//    JLabel nameLabel;
//    JLabel korLabel;
//    JLabel engLabel;
//    JLabel mathLabel;
//    JTextField nameField;
//    JTextField korField;
//    JTextField engField;
//    JTextField mathField;
//    JTable resultTable;
//    JPanel subPanel;
//    SQLExecutor sqlExecutor;
//    String[] columnNames;
//    String[][] data;
//    DefaultTableModel model;
//    public InsertStudentGUI() {
//        setTitle("Insert Student");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 200);
//        setLayout(new BorderLayout());
//        subPanel = new JPanel(new GridLayout(5,2));
//        subPanel.add(nameLabel = new JLabel("Student's Name"));
//        subPanel.add(nameField = new JTextField(10));
//        subPanel.add(korLabel = new JLabel("Korean Score"));
//        subPanel.add(korField = new JTextField(5));
//        subPanel.add(engLabel = new JLabel("Englisg Score"));
//        subPanel.add(engField = new JTextField(5));
//        subPanel.add(mathLabel = new JLabel("Math Score"));
//        subPanel.add(mathField = new JTextField(5));
//        subPanel.add(insertButton = new JButton("Insert Student"));
//        subPanel.add(inquiryButton = new JButton("Inquiry Student"));
//
//        try {
//            sqlExecutor = new SQLExecutor("SELECT * FROM STUDENT");
//            ResultSet resultSet = sqlExecutor.resultSet;
//            ResultSetMetaData metaData = resultSet.getMetaData();
//            int columnCount = metaData.getColumnCount();
//            columnNames = new String[columnCount];
//            for (int i = 1; i <= columnCount; i++) {
//                columnNames = new String[]{(metaData.getColumnName(i))};
//            }
//            // ResultSet의 데이터를 벡터에 저장
//            while (resultSet.next()) {
//
//                String[] row = new String[];
//                for (int i = 1; i <= columnCount; i++) {
//                    row.add(resultSet.getObject(i));
//                }
//                data.add(row);
//            }
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//
//        model = new DefaultTableModel(data, columnNames);
//        resultTable = new JTable(model);
//
//        resultTable.getTableHeader().setReorderingAllowed(false);
//        resultTable.getTableHeader().setResizingAllowed(false);
//        this.add(resultTable, BorderLayout.CENTER);
//        this.add(subPanel, BorderLayout.WEST);
//
//        insertButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                String name = nameField.getText();
//                int korScore;
//                int engScore;
//                int mathScore;
//                try {
//                    korScore = Integer.parseInt(korField.getText());
//                    engScore = Integer.parseInt(engField.getText());
//                    mathScore = Integer.parseInt(mathField.getText());
//                    sqlExecutor = new SQLExecutor("INSERT INTO STUDENT VALUES('"+name+"',"+korScore+","+engScore+","+mathScore+")");
//
//                } catch (Exception ex) {
//                    System.out.println(ex.getMessage());
//                }
//            }
//        });
//        inquiryButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    sqlExecutor = new SQLExecutor("SELECT * FROM STUDENT");
//                    int result = sqlExecutor.result;
//                    ResultSet resultSet = sqlExecutor.resultSet;
//                    ResultSetMetaData metaData = resultSet.getMetaData();
//                    int columnCount = metaData.getColumnCount();
//                    columnNames = new Vector<>();
//                    for (int i = 1; i <= columnCount; i++) {
//                        columnNames.add(metaData.getColumnName(i));
//                    }
//                    // ResultSet의 데이터를 벡터에 저장
//                    data = new Vector<>();
//                    while (resultSet.next()) {
//                        Vector<Object> row = new Vector<>();
//                        for (int i = 1; i <= columnCount; i++) {
//                            row.add(resultSet.getObject(i));
//                        }
//                        data.add(row);
//                    }
//                } catch (Exception ex){
//                    System.out.println(ex.getMessage());
//                }
//            }
//        });
//
//
//        setVisible(true);
//    }
//    public static void main(String[] args) {
//        new InsertStudentGUI();
//    }
//}
