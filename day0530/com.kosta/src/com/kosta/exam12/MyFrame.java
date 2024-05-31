package com.kosta.exam12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    ArrayList<JButton> btns = new ArrayList<>();
    public MyFrame(){
        //설정한 그리드의 수와 컴포넌트의 수가 맞지 않으면
        // 컴포넌트에 수에 알아서 맞추어 준다.
        this.setLayout(new GridLayout(10, 10));
        for(int i = 0; i < 100; i++){
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
