package com.kosta.exam03;

public class Account {
    private int balance;

    public synchronized void call(int amount, String name, int i){
        balance += amount;
        System.out.println(name +"님이 "+ i +"번째 기부하셨습니다. \n현재 총 모금액 : "+ balance);
    }

    public int getBalance(){
        return balance;
    }
}
