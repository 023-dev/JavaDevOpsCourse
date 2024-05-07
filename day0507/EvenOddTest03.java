// 사용자한테 임의의 수 n을 입력받아 짝수인지 홀수인지 판별하는 프로그램
import java.util.Scanner;
public class EvenOddTest03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int n = sc.nextInt();
		String rst = "짝수입니다.";
		if (Tester(n)>0){
			rst = "홀수입니다.";			
		}
		System.out.println(rst);
	}
	public static int Tester(int n){
		return n % 2;
	}
}