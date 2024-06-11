package com.kosta.date;

import java.util.Calendar;
import java.util.Date;

public class DateTest3 {
    public static void main(String[] args) {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            Date today = calendar.getTime();
            int year = calendar.get(calendar.YEAR);
            int month = calendar.get(calendar.MONTH)+1;
            int date = calendar.get(calendar.DATE);
            int hour = calendar.get(calendar.HOUR_OF_DAY);
            int min = calendar.get(calendar.MINUTE);
            int sec = calendar.get(calendar.SECOND);
            String[] d = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
            String day = d[calendar.get(calendar.DAY_OF_WEEK)];
            System.out.printf("%d-%d-%d(%s) %d:%d:%d\n", year, month, date, day, hour, min, sec);
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
