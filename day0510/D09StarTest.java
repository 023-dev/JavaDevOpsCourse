import java.util.Scanner;
class D09StarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요. : ");
		String name = sc.next();
		System.out.print("생월을 입력해주세요. : ");
		int month =sc.nextInt();
		System.out.print("생일을 입력해주세요. : ");
		int day =sc.nextInt();
		String star = "";
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			if (day > 31){
				System.out.printf("올바른 날짜를 입력하세요.");
				return;
			}
		}else if (month==2){
			if (day > 28){
				System.out.printf("올바른 날짜를 입력하세요.");
				return;
			}
		}else if (month==4||month==6||month==9||month==11){
			if (day > 30){
				System.out.printf("올바른 날짜를 입력하세요.");
				return;
			}
		}else{
			System.out.printf("올바른 날짜를 입력하세요.");
			return;
		}
		switch(month){
			case 1:if(day> 19)star="물병자리";else star="염소자리";break;
			case 2:if (day> 18)star = "물고기자리";else star = "물병자리";break;
			case 3:if (day> 20)star = "양자리";else star = "물고기자리";break;
			case 4:if (day> 19)star = "황소자리";else star = "물고기자리";break;
			case 5:if (day> 20)star = "쌍둥이자리";else star = "황소자리";break;
			case 6:if (day> 21)star = "게자리";else star = "쌍둥이자리";break;
			case 7:if (day> 22)star = "사자자리";else star = "게자리";break;
			case 8:if (day> 22)star = "처녀자리";else star = "사자자리";break;
			case 9:if (day> 22)star = "천칭자리";else star = "처녀자리";break;
			case 10:if (day> 23)star = "전갈자리";else star = "천칭자리";break;
			case 11:if (day> 22)star = "궁수자리";else star = "전갈자리";break;
			case 12:if (day> 21)star = "염소자리";else star = "궁수자리";break;
		}
		System.out.printf("%s님의 생일은 %d월 %d일이므로 별자리는 %s입니다.", name, month, day, star);
	}
}
