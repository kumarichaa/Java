class CaseConversion
{
	public static void main(String[] args)
	{
		String s="richaaa";
		System.out.println(s.toUpperCase());
		String s1="Richakumari";
		System.out.println(s1.toUpperCase());
		String s2="RICHA KUMARI";
		System.out.println(s2.toLowerCase());
		
		//----------------------------------------------------------------------
		//Type conversion
		int a=10,b=20;
		System.out.println(a+b);//30
		String s3=String.valueOf(a);
		String s4=String.valueOf(b);
		System.out.println(s3+s4);//1020
		System.out.println(s3);//10
		
		char[] c=s.toCharArray();
		System.out.println(s);
		char[] c1=s2.toCharArray();
		System.out.println(s2);
		
		
		
	}
	
}