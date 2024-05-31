package com.kosta.exam02;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;

class Repair extends JFrame {

    JLabel jLabelItem00;
    JLabel jLabelItem01;
    JLabel jLabelItem02;
    JLabel jLabelItem03;
    JLabel jLabelItem04;
    JLabel jLabelItem05;
    JLabel jLabelPrice00;
    JLabel jLabelPrice01;
    JLabel jLabelPrice02;
    JLabel jLabelPrice03;
    JLabel jLabelPrice04;
    JLabel jLabelPrice05;
    JCheckBox jCheckBoxItem01;
    JCheckBox jCheckBoxItem02;
    JCheckBox jCheckBoxItem03;
    JCheckBox jCheckBoxItem04;

    JLabel jLabelEmpty00;
    JLabel jLabelEmpty05;

    HashMap<JCheckBox,JLabel> jCheckBoxMap;
    public Repair() {
        jCheckBoxMap = new HashMap<>();

        JPanel jPanel = new JPanel();
        JPanel jPanel00 = new JPanel();
        JPanel jPanel01 = new JPanel();
        JPanel jPanel02 = new JPanel();
        JPanel jPanel03 = new JPanel();
        JPanel jPanel04 = new JPanel();
        JPanel jPanel05 = new JPanel();

        jLabelItem00 = new JLabel("수리");
        jLabelPrice00 = new JLabel("가격(원)");
        jLabelEmpty00 = new JLabel("체크 박스");
        jPanel00.add(jLabelItem00);
        jPanel00.add(jLabelPrice00);
        jPanel00.add(jLabelEmpty00);

        jLabelItem01 = new JLabel("엔진 오일 교환");
        jLabelPrice01 = new JLabel("45000");
        jCheckBoxItem01 = new JCheckBox();
        jCheckBoxMap.put(jCheckBoxItem01,jLabelPrice01);
        jPanel01.add(jLabelItem01);
        jPanel01.add(jLabelPrice01);
        jPanel01.add(jCheckBoxItem01);

        jLabelItem02 = new JLabel("자동 변속기 오일 교환");
        jLabelPrice02 = new JLabel("80000");
        jCheckBoxItem02 = new JCheckBox();
        jCheckBoxMap.put(jCheckBoxItem02,jLabelPrice02);
        jPanel02.add(jLabelItem02);
        jPanel02.add(jLabelPrice02);
        jPanel02.add(jCheckBoxItem02);

        jLabelItem03 = new JLabel("에어콘 필터 교환");
        jLabelPrice03 = new JLabel("30000");
        jCheckBoxItem03 = new JCheckBox();
        jCheckBoxMap.put(jCheckBoxItem03,jLabelPrice03);
        jPanel03.add(jLabelItem03);
        jPanel03.add(jLabelPrice03);
        jPanel03.add(jCheckBoxItem03);

        jLabelItem04 = new JLabel("타이어 교환");
        jLabelPrice04 = new JLabel("100000");
        jCheckBoxItem04 = new JCheckBox();
        jCheckBoxMap.put(jCheckBoxItem04,jLabelPrice04);
        jPanel04.add(jLabelItem04);
        jPanel04.add(jLabelPrice04);
        jPanel04.add(jCheckBoxItem04);

        jLabelItem05 = new JLabel("총합");
        jLabelPrice05 = new JLabel("0");
        jLabelEmpty05 = new JLabel("비고");
        jPanel05.add(jLabelItem05);
        jPanel05.add(jLabelPrice05);
        jPanel05.add(jLabelEmpty05);
        jPanel05.setForeground(Color.BLACK);
        // 각 패널의 레이아웃 설정
        jPanel00.setLayout(new GridLayout(1, 3));
        jPanel01.setLayout(new GridLayout(1, 3));
        jPanel02.setLayout(new GridLayout(1, 3));
        jPanel03.setLayout(new GridLayout(1, 3));
        jPanel04.setLayout(new GridLayout(1, 3));
        jPanel05.setLayout(new GridLayout(1, 3));

        jPanel00.setBorder(new LineBorder(Color.BLACK, 2));
        jPanel01.setBorder(new LineBorder(Color.BLACK, 2));
        jPanel02.setBorder(new LineBorder(Color.BLACK, 2));
        jPanel03.setBorder(new LineBorder(Color.BLACK, 2));
        jPanel04.setBorder(new LineBorder(Color.BLACK, 2));
        jPanel05.setBorder(new LineBorder(Color.BLACK, 2));

        // 메인 패널 레이아웃 설정 및 추가
        jPanel.setLayout(new GridLayout(6, 1));
        jPanel.add(jPanel00);
        jPanel.add(jPanel01);
        jPanel.add(jPanel02);
        jPanel.add(jPanel03);
        jPanel.add(jPanel04);
        jPanel.add(jPanel05);

        for (JCheckBox jCheckBox : jCheckBoxMap.keySet()) {jCheckBox.addActionListener(e -> isSelected());}

        // 프레임 설정
        setLayout(new BorderLayout());
        add(jPanel, BorderLayout.CENTER);

        setTitle("Car Repair Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
    }

    public void isSelected() {
        int result = 0;
        for (JCheckBox jCheckBox : jCheckBoxMap.keySet())
            if(jCheckBox.isSelected())
                result += Integer.parseInt(jCheckBoxMap.get(jCheckBox).getText());
        jLabelPrice05.setText(String.valueOf(result));
    }
}
public class RepairCheck { public static void main(String[] args) {new Repair();}}