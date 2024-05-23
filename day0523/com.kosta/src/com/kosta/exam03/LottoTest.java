package com.kosta.exam03;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.TreeSet;

public class LottoTest {
    public static void main(String[] args) {
        Set lotto = new TreeSet();
        Random random = new Random(System.currentTimeMillis());
        while(lotto.size() < 6){
            lotto.add(random.nextInt(45)+1>>>1);
        }
        System.out.println(lotto);
    }
}
