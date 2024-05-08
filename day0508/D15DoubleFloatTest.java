/*
실수를 위한 자료형
float(4byte)
double(8byte)
자바에서는 실수값이 오면 기본적으로 double로 취급합니다.
실수 값을 바로 float 변수에 저장할 수 없습니다.
*/
class D15DoubleFloatTest{
	public static void main(String[] args) {
		double byte8;
		byte8 = 26.7;
		System.out.println(byte8);

		float byte4;
		byte4 = (float)20.7;//or byte4 = 20.7f;
		System.out.println(byte4);
	}
}
