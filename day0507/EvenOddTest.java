// 사용자한테 임의의 수 n을 입력받아 짝수인지 홀수인지 판별하는 프로그램
import java.util.Scanner;
public class EvenOddTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int n = sc.nextInt();
		if (Tester(n)>0){
			System.out.println("홀수입니다.");			
		}else{
			System.out.println("짝수입니다.");
		}
	}
	public static int Tester(int n){
		return n % 2;
	}
}