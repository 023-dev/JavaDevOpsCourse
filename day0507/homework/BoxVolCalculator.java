import java.util.Scanner;
public class BoxVolCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.print("길이를 입력해주세요. : ");
		int x = sc.nextInt();
		System.out.print("너비를 입력해주세요. : ");
		int y = sc.nextInt();
		System.out.print("높이를 입력해주세요. : ");
		int z = sc.nextInt();
		int vol = x*y*z;
		System.out.printf("상자의 부피는 %d입니다.", vol);
	}
}