package com.kosta.exam04;

public class ARSTest {
    public static void main(String[] args) {
        Account account = new Account();
        Person p1 = new Person("김**", account);
        Person p2 = new Person("이**", account);
        Person p3 = new Person("박**", account);
        Person p4 = new Person("강**", account);
        Person p5 = new Person("최**", account);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        try {//waits for this thread to die.
            p1.join();
            p2.join();
            p3.join();
            p4.join();
            p5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(account.getBalance());
    }
}
