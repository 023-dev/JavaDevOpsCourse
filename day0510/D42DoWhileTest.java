import java.util.Scanner;
class D42DowhileTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int n = sc.nextInt();
		int i = 1;
		do{
			System.out.printf("%d\n", i);	
			i++;
		}while(i <= n);
		
	}
}
