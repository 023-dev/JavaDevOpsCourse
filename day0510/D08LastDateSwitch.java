import java.util.Scanner;
class D08LastDateSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요. : ");
		int month =sc.nextInt(), lastDate;
		switch(month){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				lastDate=31;
				break;
			case 4:case 6:case 9:case 11:
				lastDate=30;
				break;
			case 2:
				lastDate=28;
				break;
			default:
				System.out.println("범위내 수를 입력하세요.");
				return;
		}
		System.out.printf("%d월은 %d일까지 있습니다.", month, lastDate);
	}
}
