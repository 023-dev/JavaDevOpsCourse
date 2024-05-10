import java.util.Scanner;
class D37WhileTestGugudan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		int i = 1;
		System.out.printf("*** %d ***\n", n);
		while(i<10){
			System.out.printf("%d * %d = %d\n", n, i, n*i);
			i++;
		}
	}
}
