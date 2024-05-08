import java.util.Scanner;
class D22MultipleOf6{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		int num = sc.nextInt();
		String result = "6의 배수입니다.";
		if (num%6!=0){
			result = "6의 배수가 아닙니다.";
		}
		System.out.printf("%d는 %s", num, result);
	}
}
