package com.kosta.exam13;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends JFrame {
    ArrayList<JButton> btns = new ArrayList<>();
    public MyFrame(){
        // 가운데를 중심으로 중요한 컨텐츠를 가운데 놓고 부가적인 메뉴등을
        //화면을 위 아래 오른쪽 인쪽 배치하여 사용한다.
        //  위 아래 왼 오른 쪽은 생략하여 사용하고 가운데는 생략하지 않는다.
        this.setLayout(new BorderLayout());
        for(int i = 0; i < 15; i++){
           btns.add(new JButton(String.valueOf(i+1)));
        }
        this.add(btns.get(0) , BorderLayout.NORTH);
        this.add(btns.get(1) , BorderLayout.EAST);
        this.add(btns.get(2) , BorderLayout.WEST);
        this.add(btns.get(3) , BorderLayout.SOUTH);

        this.setVisible(true);
        this.setTitle("btnTest");
        this.setSize(500, 500);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
