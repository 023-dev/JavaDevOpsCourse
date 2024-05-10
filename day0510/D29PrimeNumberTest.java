import java.util.Scanner;
class D29PrimeNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<n;i++){
			if (n%i==0){
				isPrime = false;
				break;
			}
		}
		if (isPrime){
			System.out.printf("%d는 소수입니다.", n);
		}else{
			System.out.printf("%d는 소수가 아닙니다.", n);
		}
	}
}
