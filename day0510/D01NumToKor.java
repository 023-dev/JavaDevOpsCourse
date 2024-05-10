import java.util.Scanner;
class D01NumToKor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		int num =sc.nextInt();
		if(num < 100 || num >= 0){ 
			String numToKor = "";
			String kor = "영일이삼사오육칠팔구";
			if (num/10 > 0){
				if (num/10==1)
					numToKor += "십";
				else
					numToKor += kor.charAt(num/10)+"십";
				if (num%10>0)
					numToKor+= kor.charAt(num%10);
			}else numToKor += kor.charAt(num%10);
		}else{
			numToKor = "올바른 숫자를 입력하세요.";
		}
		System.out.println(numToKor);
	}
}
