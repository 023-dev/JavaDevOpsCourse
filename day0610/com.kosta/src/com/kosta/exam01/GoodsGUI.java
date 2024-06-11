package com.kosta.exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

public class GoodsGUI extends JFrame {

    JTextField jtf_number;
    JTextField jtf_name;
    JTextField jtf_qty;
    JTextField jtf_price;

    JButton btn_create;
    JButton btn_read;
    JButton btn_update;
    JButton btn_delete;

    Vector<String> colName;
    Vector<Vector<String>> rowData;
    JTable table;

    int number;
    String item;
    int qty;
    int price;

    //JTextField.getValue => store in variable
    public void setData() {
        this.number = Integer.parseInt(jtf_number.getText());
        this.item = jtf_name.getText();
        this.qty = Integer.parseInt(jtf_qty.getText());
        this.price = Integer.parseInt(jtf_price.getText());
    }

    public void read() {
        GoodsDAO dao = new GoodsDAO();
        ArrayList<GoodsVO> list = dao.ReadGoods();
        rowData.clear();
        for (GoodsVO goods : list) {
            Vector<String> row = new Vector<>();
            row.add(String.valueOf(goods.getNumber()));
            row.add(goods.getItem());
            row.add(String.valueOf(goods.getQty()));
            row.add(String.valueOf(goods.getPrice()));
            rowData.add(row);
        }
        table.updateUI();
    }

    public GoodsGUI(){
        setTitle("GOODS");
        setSize(600, 550);
        setLayout(new BorderLayout());

        jtf_number = new JTextField(5);
        jtf_name = new JTextField(5);
        jtf_qty = new JTextField(5);
        jtf_price = new JTextField(5);

        JPanel panel = new JPanel(new GridLayout(1,8));
        panel.add(new JLabel("상품번호 : "));
        panel.add(jtf_number);

        panel.add(new JLabel("상품이름 : "));
        panel.add(jtf_name);

        panel.add(new JLabel("상품수량 : "));
        panel.add(jtf_qty);

        panel.add(new JLabel("상품가격 : "));
        panel.add(jtf_price);

        JPanel panel_btn = new JPanel(new FlowLayout());
        btn_create = new JButton("상품등록");
        btn_read = new JButton("상품조회");
        btn_update = new JButton("상품수정");
        btn_delete = new JButton("상품삭제");
        panel_btn.add(btn_create);
        panel_btn.add(btn_read);
        panel_btn.add(btn_update);
        panel_btn.add(btn_delete);

        rowData = new Vector<Vector<String>>();
        colName = new Vector<String>();
        colName.add("상품번호");
        colName.add("상품이름");
        colName.add("상품수량");
        colName.add("상품가격");
        table = new JTable(rowData, colName);
        JScrollPane jsp = new JScrollPane(table);
        table.addMouseListener(new MouseListener() {
            @Override public void mouseReleased(MouseEvent e) {
                int index = table.getSelectedRow();
                Vector<String> row = rowData.get(index);
                jtf_number.setText(row.get(0));
                jtf_name.setText(row.get(1));
                jtf_qty.setText(row.get(2));
                jtf_price.setText(row.get(3));
                setData();
            }
            @Override public void mouseClicked(MouseEvent e) {}
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
        });

        this.add(panel, BorderLayout.NORTH);
        this.add(panel_btn, BorderLayout.CENTER);
        this.add(jsp, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        btn_create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                GoodsVO vo = new GoodsVO(number, item, qty, price);
                GoodsDAO dao = new GoodsDAO();
                int rslt = dao.CreateGoods(vo);
                if (rslt > 0) {
                    System.out.println("created");
                    read();
                } else {
                    System.out.println("failed");
                }
            }
        });
        btn_read.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                read();
            }
        });
        btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                GoodsVO vo = new GoodsVO(number, item, qty, price);
                GoodsDAO dao = new GoodsDAO();
                int rslt = dao.UpdateGoods(vo);
                if (rslt > 0) {
                    System.out.println("updated");
                    read();
                } else {
                    System.out.println("failed");
                }
            }
        });
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setData();
                GoodsDAO dao = new GoodsDAO();
                int rslt = dao.DeleteGoods(number);
                if (rslt > 0) {
                    System.out.println("deleted");
                    read();
                } else {
                    System.out.println("failed");
                }
            }
        });
        read();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GoodsGUI::new);
    }
}
