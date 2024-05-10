import java.util.Scanner;
class D32FactorialTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int n = sc.nextInt();
		int fac = 1;
		for(int i=n;i>0;i--){
			fac *= i;
			System.out.print(fac);
			if (i!=1){
				System.out.print("*");
			}
		}
		System.out.printf("= %d", fac);
	}
}
