package com.kosta.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest4 {
    public static void main(String[] args) {
        //GregorianCalender : Calender의 후손, 윤년의 정보 추가.
        GregorianCalendar today = new GregorianCalendar();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH)+1;
        int date = today.get(Calendar.DAY_OF_MONTH);
        int hour = today.get(Calendar.HOUR_OF_DAY);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);
        int millis = today.get(Calendar.MILLISECOND);
        String[] d = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        String day = d[today.get(Calendar.DAY_OF_WEEK)];
        System.out.printf("%d-%d-%d(%s) %d:%d:%d:%d\n", year, month, date, day, hour, minute, second, millis);
        if(today.isLeapYear(year)){
            System.out.println("윤년");
        } else {
            System.out.println("윤년 아님");
        }
    }
}
