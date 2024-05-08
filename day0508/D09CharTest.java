class D09CharTest 
{
	public static void main(String[] args) 
	{
		String str = "hello";
		char c;
		int i = 0, len = str.length();
		/*for
		for (int i=0;i<len;i++)
		{
			c = str.charAt(i);
			System.out.println(c);
		}
		*/
		/*while
		while(i < len){
			c = str.charAt(i);
			System.out.println(c);
			i++;
		}
		*/
		boolean flag = true;
		while(flag){
			c = str.charAt(i);
			System.out.println(c);
			i = i + 1;
			if (i == len){
				flag = false;
			}
		}
	}
}
