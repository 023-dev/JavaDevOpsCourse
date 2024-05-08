//---------------------------------------------------------------------------------------------------------------------------------------
//연습) 정부에서는 40세이상인 사람들에게 무료 암검진을 실시합니다.
//       이름과 출생연도를 입력받아 나이를 계산하고 무료 암검진 여부를
//        판별하여 결과를 출력하는 프로그램을 작성해봅니다.
//        클래스명, 변수명들은 자유롭게 합니다.
//<<실행 예>>
//이름을 입력하세요. ==> KIM
//출생연도를 입력하세요. ==> 1975
//*** 무료 암건진 판별 결과 ***
//이름 : __
//나이 : __
// 결과 : 무료 암검진 대상자입니다.
import java.time.LocalDate;
import java.util.Scanner;
public class D02CancerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		String name = sc.next();
		System.out.print("출생연도를 입력하세요. : ");
		LocalDate now = LocalDate.now();
		int byear = sc.nextInt();
		int nyear = now.getYear();
		int gyear = nyear-byear;
		String flag = "가 아닙니다.";
		if (gyear >= 40){
			flag = "입니다.";
		}
		System.out.println("\n*** 무료 암검진 판별 결과 ***");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", gyear);
		System.out.printf("결과 : 무료 암검진 대상자%s\n", flag);
	}
}