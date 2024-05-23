package com.kosta.exam03;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetTest {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("된장찌개");
        set.add("백반");
        set.add("짬뽕");
        System.out.println(set.add("김치찌개"));
        System.out.println(set);
    }
}
