class D08CharTest 
{
	public static void main(String[] args) 
	{
		String str = "hello";
		char c;
		int len = str.length();
		for (int i=0;i<len;i++)
		{
			c = str.charAt(i);
			System.out.println(c);
		}	
	}
}
