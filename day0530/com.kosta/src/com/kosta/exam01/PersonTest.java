package com.kosta.exam01;

class Person extends Thread{
    String name;
    public Person(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println(this.name+"밥");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("kim");
        Person p2 = new Person("lee");
        Person p3 = new Person("park");
        p1.setPriority(Thread.MAX_PRIORITY);
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY);
        p1.start();
        p2.start();
        p3.start();
    }
}
