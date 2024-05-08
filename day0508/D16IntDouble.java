/*
자료형이 다른 것 끼리 연산을 하면 그 결과는 그 중에 큰 자료형이 됩니다.
2(int) + 2.5(double) => double
5 / 2=> 2(int)
5 / 2.0 => 2.5(double)

int끼리 연산을 하면 결과도 int입니다.
만약 실수값의 결과를 기대한다면 그 중에 하나를 double로 변환하여 연산시킵니다.
정수 + 실수의 결과는 실수이기 때문에 int에 저장할 수 없습니다.
*/

class D16IntDouble 
{
	public static void main(String[] args) 
	{
		double a = 2 + 2.5;
		System.out.println(a);
	}
}
