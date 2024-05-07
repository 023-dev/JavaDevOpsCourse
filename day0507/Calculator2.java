import java.util.Scanner;
public class Calculator2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 ==> ");
		int a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 ==> ");
		int b = sc.nextInt();
		System.out.println("*** 사칙 연산 결과 ***");
		System.out.println("-----------------------");
		System.out.printf("%d + %d = %d\n",a, b, add2(a,b));
		System.out.printf("%d - %d = %d\n",a, b, sub2(a,b));
		System.out.printf("%d * %d = %d\n",a, b, mul2(a,b));
		System.out.printf("%d / %d = %5.2f",a, b, div2(a,b));
	}

	public static int add2(int x, int y){
		return x + y;
	}
	public static int sub2(int x, int y){
		return x - y;
	}
	public static int mul2(int x, int y){
		return x * y;
	}
	public static double div2(int x, int y){
		return x / y;
	}
}
//-------------------------------------------------------------------------------
// main 메소드의 명령들을 순착적으로 동작합니다.
// 일의 순성 맞게 명령을 내려야 합니다.
//만약 , 다음과 같이 변수를 선언하기도 전에 사용하는 명령이 오면 오류가 발생합니다.