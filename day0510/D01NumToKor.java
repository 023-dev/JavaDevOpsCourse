import java.util.Scanner;
class D01NumToKor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���. : ");
		int num =sc.nextInt();
		if(num < 100 || num >= 0){ 
			String numToKor = "";
			String kor = "�����̻�����ĥ�ȱ�";
			if (num/10 > 0){
				if (num/10==1)
					numToKor += "��";
				else
					numToKor += kor.charAt(num/10)+"��";
				if (num%10>0)
					numToKor+= kor.charAt(num%10);
			}else numToKor += kor.charAt(num%10);
		}else{
			numToKor = "�ùٸ� ���ڸ� �Է��ϼ���.";
		}
		System.out.println(numToKor);
	}
}
