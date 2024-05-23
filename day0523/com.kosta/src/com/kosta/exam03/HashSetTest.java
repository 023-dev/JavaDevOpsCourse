package com.kosta.exam03;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        //용량 자동할당해줌, 중복을 허용하지 않음, 데이터 타입 제한이 없음, boolean type 을 반환함.
        hashSet.add(100);//wrapping class 를 사용하지 않고도 auto boxing 으로 auto type casting 이 된다.
        hashSet.add("사과");
        hashSet.add(56.7);
        hashSet.add(true);
        System.out.println(hashSet.add(100));
        System.out.println(hashSet);
    }
}
