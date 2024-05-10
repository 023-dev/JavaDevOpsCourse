import java.util.Scanner;
class D40PrintStarWhile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("별을 몇줄 출력할까요?");
		int rows = sc.nextInt();
		int row = 0;
		System.out.print("별을 몇칸 출력할까요?");
		int cols = sc.nextInt();
		while(row < rows){
			int col = 0;
			while(col < cols){
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
}
