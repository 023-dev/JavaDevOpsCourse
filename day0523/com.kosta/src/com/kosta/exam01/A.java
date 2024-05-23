package com.kosta.exam01;

public class A {
    public void pro() {
        System.out.println("A.pro");
    }
    public final void test() {
        System.out.println("A.final");
    }
}

class B extends A {
    public void pro() {
        System.out.println("B.pro");
    }
//    public void test() {
//        System.out.println("B.test");
//    }
}