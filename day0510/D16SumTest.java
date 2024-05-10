import java.util.Scanner;
class D16SumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		int odd = 0, even = 0;
		for(int i=1;i<n+1;i++)
			if(i%2!=0)odd+=i;
			else even+=i;
		System.out.printf("짝수의 합은 %d이고, 홀수의 합은 %d입니다.", even, odd);
	}
}
