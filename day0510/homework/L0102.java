// 60점 이상, 축하합니다. 문장 추가
import java.util.Scanner;
public class L0102{
	public static void main(String[] args){
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("성적을 입력하시오. : ");
		score = input.nextInt();
		if(score >= 60)
			System.out.println("합격!");
			System.out.println("축하합니다.");
		else
			System.out.println("불합격!");
	}
}