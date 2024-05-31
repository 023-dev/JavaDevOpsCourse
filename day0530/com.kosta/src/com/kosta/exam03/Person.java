package com.kosta.exam03;

public class Person extends Thread {
    String name;
    //다른 성금자와 모금액을 공유하기 위하여 모금액 클래스를 멤버변수로 선언합니다.
    Account account;
    public Person(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i<=10; i++) {
            account.call(1000, this.name, i);
            try {
                Thread.sleep(300);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
