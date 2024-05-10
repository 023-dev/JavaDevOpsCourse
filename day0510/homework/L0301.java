// if문을 사용하여 다양한 메시지 출력
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class L0301{
	public static void main(String[] args){
		double prod = 0.0, r;
		int i, n;

		Scanner input = new Scanner(System.in);
		System.out.print("실수 r:");
		r = input.nextDouble();
		System.out.print("거듭제곱횟수 n:");
		n = input.nextInt();

		for(i=0;i<n;i++){
			prod *= r;
		}
		System.out.println(prod);
	}
}
//Q.3-1 r = 2, n = 4, prod = 16 