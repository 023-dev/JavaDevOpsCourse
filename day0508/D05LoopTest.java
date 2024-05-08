class D05LoopTest{
	public static void main(String[] args){
		boolean flag = true;
		int cnt = 0;
		while (flag){
			System.out.println("바밤바");
			cnt += 1;
			flag = cnt<7;
		}
	}
}
