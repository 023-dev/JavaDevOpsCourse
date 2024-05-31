package com.kosta.exma09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton btn01;
    JButton btn02;

    public MyFrame(){
        this.setLayout(new FlowLayout());
        btn01 = new JButton("남자");
        btn02 = new JButton("여자");
        this.add(btn01);
        this.add(btn02);
        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }
}
