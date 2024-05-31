package com.kosta.exam11;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    ArrayList<JButton> btns = new ArrayList<>();
    public MyFrame(){
        this.setLayout(new FlowLayout());
        for(int i = 0; i < 15; i++){
           btns.add(new JButton(String.valueOf(i+1)));
        }
        for (JButton btn : btns){
            this.add(btn);
        }
        this.setVisible(true);
        this.setTitle("btnTest");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
