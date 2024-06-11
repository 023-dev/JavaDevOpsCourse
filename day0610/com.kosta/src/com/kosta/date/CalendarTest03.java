package com.kosta.date;

import java.awt.event.KeyListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest03 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH), 1);
        int diff = calendar.get(Calendar.DAY_OF_WEEK);
        
        System.out.printf("\t*** %d년 %d월 ***\n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 1; i < diff; i++) {
            System.out.print("\t");
        }
        for(int i = 1; i<= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            System.out.print(i+"\t");
            if ((i+diff-1) % 7 == 0){
                System.out.println();
            }
        }
    }
}
