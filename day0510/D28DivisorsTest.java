import java.util.Scanner;
class D28DivisorsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int n = sc.nextInt();
		String result = "";
		System.out.printf("숫자 %d의 약수는 1", n);
		for(int i=2;i<n+1;i++){
			if (n%i==0){
				System.out.printf(", %d ", i);
			}
		}
		System.out.print("입니다.");
	}
}
