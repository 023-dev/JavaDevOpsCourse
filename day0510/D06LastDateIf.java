import java.util.Scanner;
class D06LastDateIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요. : ");
		int month =sc.nextInt(), lastDate;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12||){
			lastDate=31;
		}else if(month==4||month==6||month==9||month==11){
			lastDate=30;
		}else if(month==2){
			lastDate=28;
		}
		System.out.printf("%d월은 %d일까지 있습니다.", month, lastDate);
	}
}
