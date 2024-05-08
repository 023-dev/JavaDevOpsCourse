class D17IntDouble {
	public static void main(String[] args) {
		//나누기 한 결과를 실수값에..
		double fdiv = 5/2.0;//== double fdiv = 5/(double)2;
		double idiv = 5/2;
		System.out.printf(fdiv+" " + idiv);
	}
}
/*
5/2 => (int)/(int)로 2가 반환 그리고 이것을 double인 변수에 넣으니 2.0이 된 것이다.
*/