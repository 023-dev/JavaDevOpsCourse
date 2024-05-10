class D33SigamTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<31;i++){
			for(int j=0;j<6;j++){
				sum += i*j;
			}
		}
		System.out.printf("%d", sum);
	}
}
