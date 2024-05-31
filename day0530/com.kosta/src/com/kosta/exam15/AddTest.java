package com.kosta.exam15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTest extends JFrame {
    JTextField text_first;
    JTextField text_second;
    JTextField text_third;
    public AddTest(){
        text_first = new JTextField(10);
        text_second = new JTextField(10);
        text_third = new JTextField(10);

        JPanel panel_center = new JPanel();
        JPanel panel_footer = new JPanel();

        panel_center.setLayout(new GridLayout(3, 2));
        panel_footer.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel_center.add(new JLabel("First Integer : "));
        panel_center.add(text_first);
        panel_center.add(new JLabel("Second Integer : "));
        panel_center.add(text_second);
        panel_center.add(new JLabel("Third Integer : "));
        panel_center.add(text_third);
        JButton btn_add = new JButton("Add");
        JButton btn_clear = new JButton("Clear");

        panel_footer.add(btn_add);
        panel_footer.add(btn_clear);

        setLayout(new BorderLayout());
        add(panel_center, BorderLayout.CENTER);
        add(panel_footer, BorderLayout.SOUTH);

        setSize(500, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = Integer.parseInt(text_first.getText()) + Integer.parseInt(text_second.getText()) +Integer.parseInt(text_third.getText());
                System.out.println(result);
            }
        });
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_first.setText(null);
                text_second.setText(null);
                text_third.setText(null);
            }
        });

        text_first.getText();
    }

    public static void main(String[] args) {
        new AddTest();
    }
}
