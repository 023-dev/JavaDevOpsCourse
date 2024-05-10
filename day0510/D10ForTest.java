import java.util.Scanner;
class D10ForTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("문자를 입력하세요. : ");
		String s = sc.next();
		for (int i = 0;i < 10 ;i++ ){
			System.out.println(s);
		}
		System.out.println("-------------------");
		for (int j = 10;j > 0 ;j-- ){
			System.out.println(s);
		}
	}
}
