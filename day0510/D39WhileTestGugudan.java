import java.util.Scanner;
class D39WhileTestGugudan{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.print("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		int i = 1;
		System.out.printf("*** %d ***\n", n);
		while(false){
			System.out.printf("%d * %d = %d\n", n, i, n*i);
			i++;
			if (i>9){
				flag = false;
			}
		}
	}
}
