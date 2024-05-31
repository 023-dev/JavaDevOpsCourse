package com.kosta.exam08;

import java.util.Random;

public class Product {
    int number;
    String name;
    boolean isNew;
    public synchronized void makeNumber(){
        try {
            while (isNew == true) wait();
            if(!isNew){
                Random rand = new Random();
                number = rand.nextInt(100)+1;
                System.out.println("생산자가 생산함 ==> " + number);
                isNew = true;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized int useNumber(){
        int n = 0;
        try {
            while (!isNew) wait();
            if(isNew){
                n=number;
                System.out.println("소비자가 소비함 ==> " + n);
                System.out.println("=====================");
                isNew = false;
                notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return n;
    }
}
