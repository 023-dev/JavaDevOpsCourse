import java.util.Date;
import java.util.Scanner;
public class D03CancerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		System.out.print("이름을 입력하세요. : ");
		String name = sc.next();
		String result = "무료암검진 대상자가 아닙니다.";
		System.out.print("출생연도를 입력하세요. : ");
		int byear = sc.nextInt();
		int gyear = today.getYear()+1900-byear;
		boolean flag = false;
		flag = gyear >= 40;
		if (flag){
			result = "무료암검진 대상자입니다.";
		}
		System.out.println("\n*** 무료 암검진 판별 결과 ***");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", gyear);
		System.out.printf("결과 : %s\n", result);
	}
}