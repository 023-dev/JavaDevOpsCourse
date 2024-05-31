package com.kosta.exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

public class JCheckBoxTest extends JFrame {
    JCheckBox jCheckBox01;
    JCheckBox jCheckBox02;
    JLabel jLabel;

    public JCheckBoxTest(){
        setLayout(new FlowLayout());
        jCheckBox01 = new JCheckBox("a");
        jCheckBox02 = new JCheckBox("b");
        jLabel = new JLabel("아무것도 선택하지 않았습니다.");
        this.add(jLabel);
        this.add(jCheckBox01);
        this.add(jCheckBox02);

        jCheckBox01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isSelected();
            }
        });
        jCheckBox02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isSelected();
            }
        });
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void isSelected(){
        HashSet<JCheckBox> jCheckBoxSet = new  HashSet<>();
        jCheckBoxSet.add(jCheckBox01);
        jCheckBoxSet.add(jCheckBox02);
        String result="";
        boolean isSelectedAll = true;
        for(JCheckBox jCheckBox : jCheckBoxSet){
            if(jCheckBox.isSelected()){
                result.concat(jCheckBox.getText());
            }else {
                isSelectedAll = false;
            }
        }
        if (isSelectedAll){
            jLabel.setText("모두 선택되었습니다.");
        } else {
            jLabel.setText(result);
        }
    }
    public static void main(String[] args) {
        JCheckBoxTest jCheckBoxTest = new JCheckBoxTest();
    }
}
