//String concatenation using format()method

class StrFormat
{
	public static void main(String[] args)
	{
		String s1=new String("Hello");
		String s2=new String(" world");
		//String s=String("Hello");
		String s=String.format("%s%s",s1,s2);
		System.out.println(s.toString());
	}
}