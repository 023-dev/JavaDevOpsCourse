package com.kosta.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder currentInput;
    private double result;
    private String operator;

    public Calculator() {
        // 초기화
        currentInput = new StringBuilder();
        result = 0;
        operator = "";

        // 프레임 설정
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.DARK_GRAY);

        // 디스플레이 설정
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.GREEN);
        display.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(display, BorderLayout.NORTH);

        // 버튼 패널 설정
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.setBackground(Color.DARK_GRAY);

        // 버튼 텍스트 배열
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        // 버튼 생성 및 패널에 추가
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.setBackground(Color.LIGHT_GRAY);
            button.setForeground(Color.BLACK);
            button.setFocusPainted(false);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) == 'C') {
            // Clear
            currentInput.setLength(0);
            operator = "";
            result = 0;
            display.setText("");
        } else if (command.charAt(0) == '=') {
            // 계산
            calculate(Double.parseDouble(currentInput.toString()));
            operator = "";
            currentInput.setLength(0);
            display.setText(String.valueOf(result));
        } else if ("+-*/".indexOf(command) >= 0) {
            // 연산자 처리
            if (currentInput.length() > 0) {
                calculate(Double.parseDouble(currentInput.toString()));
                currentInput.setLength(0);
            }
            operator = command;
        } else {
            // 숫자 및 소수점 처리
            currentInput.append(command);
            display.setText(currentInput.toString());
        }
    }

    private void calculate(double num) {
        switch (operator) {
            case "+":
                result += num;
                break;
            case "-":
                result -= num;
                break;
            case "*":
                result *= num;
                break;
            case "/":
                if (num != 0) {
                    result /= num;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero");
                    result = 0;
                }
                break;
            default:
                result = num;
                break;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
