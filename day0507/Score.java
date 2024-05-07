//연습) 사용자한테 이름, 국어, 영어, 수학을 입력받아 총점과 평균을 각각 구하여 출력하고 또, 평균이 60점 이상이면 합격 그렇지 않으면 불합격을 출력하는 프로그램을 작성합니다.
import java.util.Scanner;
public class Score{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kor, mth, eng, sum;
		double avg;
		String name;
		System.out.print("이름을 입력하시오 ==>");
		name = sc.next();
		System.out.print("국어 점수를 입력하시오 ==>");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오 ==>");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오 ==>");
		mth = sc.nextInt();
		sum = kor + mth+eng;
		avg = sum / 3;
		System.out.println("*** 성적 처리 결과 ***");		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", mth);
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %3.2f\n", avg);
		System.out.printf("결과 : %s\n", avg >= 60 ? "합격" : "불합격");

	}	
}