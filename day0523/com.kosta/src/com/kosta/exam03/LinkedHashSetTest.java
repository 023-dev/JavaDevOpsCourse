package com.kosta.exam03;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("된장찌개");
        set.add("백반");
        set.add("짬뽕");
        System.out.println(set.add("김치찌개"));
        System.out.println(set);
    }
}
