package com.kosta.exam04;

public class Account {
    private int balance;

    public synchronized boolean call(int amount, String name, int i){
        if (balance == 500000)return false;
        balance += amount;
        System.out.println(name +"님이 "+ i +"번째 기부하셨습니다. \n현재 총 모금액 : "+ balance);
        return true;
    }

    public int getBalance(){
        return balance;
    }
}
