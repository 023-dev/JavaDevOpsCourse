import java.util.Scanner;
public class VarInit04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age;
		String result = "입장불가능";
		System.out.print("몇살?");
		age = sc.nextInt();
		System.out.println(age);
		if (age >= 20) {
			result = "입장가능";
		}
		System.out.println(result);
	}	
}