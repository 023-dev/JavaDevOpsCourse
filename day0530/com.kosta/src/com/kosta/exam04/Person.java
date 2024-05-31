package com.kosta.exam04;

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
        int i = 0;
        while (account.call(1000, this.name, i)) {
            i++;
            try {
                Thread.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
