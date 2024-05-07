import java.util.Scanner;
public class PersonInfo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이을 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(name+"님의 나이는 "+age+"입니다.");
	}
}