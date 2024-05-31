package com.kosta.exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuess extends JFrame {
    JTextField jtf_input;
    JLabel jlb_hint;
    JLabel jlb_result;
    int cnt;
    int user;
    int bot;
    public NumberGuess(){
        Random random = new Random();
        bot = random.nextInt(100)+1;
        setLayout(new FlowLayout());
        cnt = 1;
        String hint;
        if (bot%2==0){
            hint = "짝수입니다.";
        }else{
            hint = "홀수입니다.";
        }
        jlb_hint = new JLabel(String.format("%-20s", "힌트 : "+hint));
        add(jlb_hint);
        add(new JLabel("숫자를 추측하세요. "));
        jtf_input = new JTextField(5);
        add(jtf_input);
        jlb_result = new JLabel(String.format("%-20s", "여기에 결과가 나옵니다."));
        add(jlb_result);
        JButton btnOK = new JButton(String.format("%-10s","    확인"));
        JButton btnExit = new JButton(String.format("%-10s","    종료"));

        this.add(btnOK);
        this.add(btnExit);
        jlb_result.setOpaque(true);



        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user = Integer.parseInt(jtf_input.getText());
                if(bot==user){
                    jlb_result.setText(String.format("%-20s", "            맞았습니다.            "));
                    jlb_result.setBackground(new Color(13, 50, 111));
                    jlb_result.setForeground(Color.white);
                }else if(bot>user){
                    jlb_result.setText(String.format("%-20s", "  지금 숫자보다 더 큽니다."));
                    jlb_result.setBackground(new Color(129, 0, 32));
                    jlb_result.setForeground(Color.white);
                }else if(bot<user){
                    jlb_result.setText(String.format("%-20s", "  지금 숫자보다 더 작습니다."));
                    jlb_result.setBackground(new Color(129, 0, 32));
                    jlb_result.setForeground(Color.white);
                }
                btnOK.setText(String.format("%-8s", String.valueOf(cnt++)+"번째 확인"));
                btnOK.repaint();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        setTitle("Number Game");
        setSize(250, 150);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        NumberGuess numberGuess = new NumberGuess();
    }
}
