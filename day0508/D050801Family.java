import java.util.Scanner;
class D01Family {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƺ��� ���̸� �Է��ϼ���. : ");
		int ageDad = sc.nextInt();
		System.out.print("������ ���̸� �Է��ϼ���. : ");
		int ageMom = sc.nextInt(); 
		System.out.print("�Ƶ��� ���̸� �Է��ϼ���. : ");	
		int ageSon = sc.nextInt();
		int ageAvg = (ageDad + ageMom + ageSon) / 3;
		System.out.printf("�ƺ��� ���̴� %d�Դϴ�.", ageAvg);
		System.out.printf("������ ���̴� %d�Դϴ�.", ageAvg);
		System.out.printf("�Ƶ��� ���̴� %d�Դϴ�.", ageAvg);
		System.out.printf("������ ���� ���̴� %d�Դϴ�.", ageDad + ageMom + ageSon);
		System.out.printf("������ ��� ���̴� %d�Դϴ�.", ageAvg);
	}
}