package com.kosta.date;

import java.util.Date;

public class DateTest2 {
    public static void main(String[] args) {
        Date today = new Date();
        Date first_day = (new Date((int)today.getYear(), (int)today.getMonth(), 1));
        String[] d = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        String D = d[first_day.getDay()];
        System.out.println(D);
    }
}
