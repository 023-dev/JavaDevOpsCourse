package com.kosta.exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.StringTokenizer;

public class KorToEng extends JFrame {
    JTextArea jta1;
    JTextArea jta2;
    HashMap<String,String> translator;
    public KorToEng() {
        setTitle("KorToEng");
        translator = new HashMap<>();
        translator.put("안녕하세요","Hello");
        translator.put("텍스트", "Text");
        translator.put("영어", "English");
        translator.put("한국어", "Korean");
        translator.put("단어", "Word");
        //컴포넌트 생성
        jta1 = new JTextArea(10, 50);
        jta2 = new JTextArea(10, 50);
        JButton btnOK = new JButton("OK");
        JButton btnCancel = new JButton("Cancel");
        //레이아웃 2개 생성
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.setLayout(new GridLayout(1, 2, 10,10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        //스크롤바 추가
        JScrollPane jsp01 = new JScrollPane(jta1);
        JScrollPane jsp02 = new JScrollPane(jta2);
        //최종 적용
        p1.add(jsp01);
        p1.add(jsp02);
        p2.add(btnOK);
        p2.add(btnCancel);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringTokenizer tokenizer = new StringTokenizer(jta1.getText(), " .,;:!?()[]{}\"'\n이가으로과와을를의은는세입합됩", true);
                StringBuilder translatedText = new StringBuilder();
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    System.out.println(token);
                    translatedText.append(translator.getOrDefault(token, token));
                }
                jta2.setText(translatedText.toString());
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta2.setText(null);
                jta1.setText(null);
            }
        });
        setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.SOUTH);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        KorToEng panel = new KorToEng();
    }
}
