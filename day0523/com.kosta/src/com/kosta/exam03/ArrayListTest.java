package com.kosta.exam03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//순서유지 중복허용
        list.add("돼지국밥");
        list.add("돈까스");
        list.add("제육볶음");
        list.add("햄버거");
        list.add("햄버거");
        list.add(100);
        System.out.println(list);//list 는 배열처럼 인덱스에 의해 데이터 접근이 가능합니다.
        String str = (String) list.get(1);
        int price = (Integer) list.get(5);//Integer => int type 객체로 type casting 을 해준다.
        System.out.println(str);
        System.out.println(price);
    }
}
