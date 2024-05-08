//연습 ) 아빠나이, 엄마나이, 아들나이를 입력받아서 평균나이를 구하여 출력하는 프로그램을 작성
// 저장 및 컴파일 후 실행
import java.util.Scanner;
class AgeAvg
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("아빠의 나이를 입력하세요. : ");
		int ageF = sc.nextInt();
		System.out.print("엄마의 나이를 입력하세요. : ");
		int ageM = sc.nextInt(); 
		System.out.print("아들의 나이를 입력하세요. : ");	
		int ageS = sc.nextInt();
		int ageAvg = (ageF + ageM + ageS) / 3;
		System.out.printf("가족의 평균 나이는 %d입니다.", ageAvg);
	}
}
