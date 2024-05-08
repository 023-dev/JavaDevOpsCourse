import java.util.Scanner;
class D34ClubEnter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String result = "입장 불가능";
		if (sc.nextInt()<= 170){
			result = "입장 가능";
		}
		System.out.println(result);d
	}
}
