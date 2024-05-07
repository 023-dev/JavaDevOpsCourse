//연습) 사용자 한테 두 개의 정수를 입력받아 그 중에 큰 수를 찾아서 출력하는 프로그램을 작성합니다.
//클래스 이름, 변수 이름 등은 자유롭게 합니다.

//<< 실행 예 >>

import java.util.Scanner;

public class Comp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. : ");
		int x = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. : ");
		int y = sc.nextInt();
		if (x < y) {
			x = y;
		}
		System.out.println(x);
	}
}