public class Intern
{
	public static void main(String[] args)
	{
		String str1=new String("Welcome to tutorials of String");
		String str2="WELCOME TO OUR TUTORIALS OF JAVA STRING";
		System.out.println("Canonical representation:");
		System.out.println(str1.intern());
		System.out.println("Canonical representation:");
		System.out.println(str2.intern());
		if(str1==str2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}