package com.kosta.book;

import com.kosta.exam01.GoodsDAO;
import com.kosta.exam01.GoodsVO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

public class BookGUI extends JFrame {
    JPanel info_panel;
    JLabel jlb_publisher;
    JTextField jtf_publisher;

    JPanel btn_panel;
    JButton btn_create;
    JButton btn_read;
    JButton btn_update;
    JButton btn_delete;

    JPanel table_pannel;
    JTable table;
    Vector<Vector<String>> row_data;
    Vector<String> col_name;


    public BookGUI() {
        setTitle("도서 정보 조회 시스템");
        setSize(600, 600);
        info_panel = new JPanel(new FlowLayout());
        jlb_publisher = new JLabel("출판사 이름 : ");
        jtf_publisher = new JTextField(10);
        info_panel.add(jlb_publisher);
        info_panel.add(jtf_publisher);
        this.add(info_panel, BorderLayout.NORTH);

        btn_panel = new JPanel(new FlowLayout());
        btn_create = new JButton("등록");
        btn_read = new JButton("조회");
        btn_update = new JButton("수정");
        btn_delete = new JButton("삭제");
        btn_panel.add(btn_create);
        btn_panel.add(btn_read);
        btn_panel.add(btn_update);
        btn_panel.add(btn_delete);
        this.add(btn_panel, BorderLayout.CENTER);

        table_pannel = new JPanel();
        row_data = new Vector<Vector<String>>();
        col_name = new Vector<String>();
        col_name.add("책 번호");
        col_name.add("책 이름");
        col_name.add("책 가격");
        col_name.add("책 출판사");
        table = new JTable(row_data, col_name);
        JScrollPane jsp = new JScrollPane(table);
        table_pannel.add(jsp);
        table.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {}
            @Override public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
        });
        this.add(table_pannel, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_read.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String publisher = jtf_publisher.getText();
                if(publisher.trim().length()>0) {
                    read();
                } else {
                    read(publisher);
                }
            }
        });
        read();
    }
    public void read(){
        ArrayList<BookVO> list = new BookDAO().read();
        row_data.clear();
        for (BookVO vo : list) {
            Vector<String> row = new Vector<String>();
            row.add(String.valueOf(vo.getBookid()));
            row.add(vo.getBookname());
            row.add(String.valueOf(vo.getPrice()));
            row.add(vo.getPublisher());
            row_data.add(row);
        }
        table.updateUI();
    }
    public void read(String publisher){
        ArrayList<BookVO> list = new BookDAO().read(publisher);
        row_data.clear();
        for (BookVO vo : list) {
            Vector<String> row = new Vector<String>();
            row.add(String.valueOf(vo.getBookid()));
            row.add(vo.getBookname());
            row.add(String.valueOf(vo.getPrice()));
            row.add(vo.getPublisher());
        }
        table.updateUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookGUI::new);
    }
}
