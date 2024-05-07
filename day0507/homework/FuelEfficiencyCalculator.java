import java.util.Scanner;
public class FuelEfficiencyCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.print("출발한 지점의 주행 거리계 : ");
		int spt = sc.nextInt();
		System.out.print("도착한 지점의 주행 거리계 : ");
		int ept = sc.nextInt();
		int gpt = ept-spt;
		System.out.print("사용한 연료 : ");
		int usf = sc.nextInt();
		int efc = gpt/usf;
		System.out.printf("연비는 %dkm/1 입니다.", efc);
	}
}