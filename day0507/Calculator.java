import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		System.out.print("연산에 사용할 연산자를 고르세요.(+,-,*,/)");		
		String operator = sc.next();
		int tot = 0;
		if (operator.equals("+")){
			tot = a+b;
		} else if (operator.equals("-")){
			tot = a-b;
		} else if (operator.equals("/")){
			if (b == 0 || a == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
            		} else {
                			tot = a/b;
			}
		} else if (operator.equals("*")){
			tot = a*b;
		} else {
            		System.out.println("올바른 연산자를 입력하세요.");
			return;
        		}
		System.out.println("계산 값은 "+tot+"입니다.");
	}
}