class D24Print1To100{
	public static void main(String[] args){
		boolean flag = true;
		int n = 1;
		while (flag){
			System.out.printf("%5d", n);
			if (n==100){
				flag=false;
			}
			n=n+1
		}
	}
}
