public class StrBuilder
{
	public static void main(String args[])
	{
		StringBuilder s1=new StringBuilder("Hello");
		StringBuilder s2=new StringBuilder(" java world");
		StringBuilder Sb=s1.append(s2);
		System.out.println(Sb.toString());
		
	}
}