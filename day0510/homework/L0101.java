//1 조건 연산자 ?를 사용하여 다시 작성
import java.util.Scanner;
public class L0101{
	public static void main(String[] args){
		int score;
		Scanner input = new Scanner(System.in);
		System.out.printf("성적을 입력하시오. : ");
		score = input.nextInt();
		System.out.println(score>60?"합격!":"불합격!");
	}
}