// if문을 사용하여 다양한 메시지 출력
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class L0303{
	public static void main(String[] args){
		double prod = 0.0, r;
		int i, n;
		char flag = 'Y';
		while (flag == 'Y'){
			Scanner input = new Scanner(System.in);
			System.out.print("실수 r:");
			r = input.nextDouble();
			System.out.print("거듭제곱횟수 n:");
			n = input.nextInt();

			for(i=0;i<n;i++){
				prod *= r;
			}
			System.out.println(prod);
			System.out.print("한 번 더 ? Y(Yes) or N(No) ");
			flag = input.next().charAt(0);
			if(flag=='N')break;
		}
	}
}
//Q.3-1 r = 2, n = 4, prod = 16 
//Q.3-2 prod *= r;부분에서 계속해서 0이 되기 때문이다.
