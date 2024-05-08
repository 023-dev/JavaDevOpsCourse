import java.util.Scanner;
class D01Family {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("아빠의 나이를 입력하세요. : ");
		int ageDad = sc.nextInt();
		System.out.print("엄마의 나이를 입력하세요. : ");
		int ageMom = sc.nextInt(); 
		System.out.print("아들의 나이를 입력하세요. : ");	
		int ageSon = sc.nextInt();
		int ageAvg = (ageDad + ageMom + ageSon) / 3;
		System.out.printf("아빠의 나이는 %d입니다.", ageAvg);
		System.out.printf("엄마의 나이는 %d입니다.", ageAvg);
		System.out.printf("아들의 나이는 %d입니다.", ageAvg);
		System.out.printf("가족의 총합 나이는 %d입니다.", ageDad + ageMom + ageSon);
		System.out.printf("가족의 평균 나이는 %d입니다.", ageAvg);
	}
}