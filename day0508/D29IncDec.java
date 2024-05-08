// 증감 연산자가 단독으로 쓰일때는 변수명 앞에오거나 뒤에오거나 동일하게 동작합니다.
class D29IncDec{
	public static void main(String[] args){	
		int a = 5;
		int b = 5;
		
		a++;
		System.out.println(a);
		++b;
		System.out.println(b);
	}
}
