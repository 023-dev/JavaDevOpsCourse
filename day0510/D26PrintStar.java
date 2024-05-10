import java.util.Scanner;
class D26PrintStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 몇줄 출력할까요?");
		int rows = sc.nextInt();
		System.out.print("별을 몇개 출력할까요?");
		int colss = sc.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.printf("*");
		}
	}
}
