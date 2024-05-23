package com.kosta.exam03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class RandomName {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"변시우", "임유나", "홍석영", "조영흔", "유요한", "이동준", "박성빈", "박준수", "김예은", "이재원", "장동건", "최모래", "최가은", "박규희", "유현진", "공희상", "강동균"};
        //System.out.println(names[random.nextInt(names.length)]);
        String name = "";
        for (int i = 0; i < 50; i++){
            name = names[i%names.length];
            System.out.print(name+"\b");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n당첨자 : " + name);
    }
}
