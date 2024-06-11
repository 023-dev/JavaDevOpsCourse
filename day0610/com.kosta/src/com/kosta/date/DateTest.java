package com.kosta.date;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date();
        int YY = today.getYear() + 1900;
        int MM = today.getMonth() + 1;
        int DD = today.getDate();
        int hh = today.getHours();
        int mm = today.getMinutes();
        int ss = today.getSeconds();
        String[] d = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        String D = d[today.getDay()];

        System.out.println(YY);
        System.out.println(MM);
        System.out.println(DD);
        System.out.println(D);
        System.out.println(hh);
        System.out.println(mm);
        System.out.println(ss);
    }
}
