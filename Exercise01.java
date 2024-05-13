package com.kosta.exam;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] amountArr = new double[12];
		double tot = 0, avg = 0;
		int M = 12;
		for (int m = 0; m < M; m++) {
			System.out.printf("%d월 사용 금액을 입력하세요. ", m+1);
			amountArr[m] = sc.nextDouble();
			if (amountArr[m] < 0) {
				System.out.println("올바른 금액을 입력하세요.");
				return;
			}
		}
		tot = voidtotalAmount(amountArr);
		avg = avgAmountPerMonth(amountArr, tot);
		
	
	}
	public double voidtotalAmount(double[] amountArr) {
		int total = 0;
		for (int m = 0; m < amountArr.length; m++) {
			total += amountArr[m];
		}	
		return total;
	}
	
	public double avgAmountPerMonth(double total) {
		return total/12;
	}
	public double maxAmount(double[] amountArr) {
		
	}
	public double minAmount () {
		
	}
}
