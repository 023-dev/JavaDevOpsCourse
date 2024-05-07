import java.util.Scanner;
import java.lang.Math;
public class PolynomialCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.print("x를 입력해주세요. : ");
		double x = sc.nextInt();
		double rst = 3*Math.pow(x,3)-7*Math.pow(x,2)+9;
		System.out.printf("3x^3-7x^2+9에서 x에 %d를 대입한 값은 %d입니다.", x, rst);
	}
}