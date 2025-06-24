public class Replace
{
	public static void main(String args[])
	{
		String s=new String("Welcome to our tutorials of java String");
		System.out.println(s);
		System.out.print("Return value:");
		System.out.println(s.replace('W','R'));
		System.out.print("Return value:");
		System.out.println(s.replace('g','H'));
	}
}