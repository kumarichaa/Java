/*public int indexOf(int ch )
public int indexOf(int ch, int fromIndex)
int indexOf(String str)
int indexOf(String str, int fromIndex)*/


public class IndexOf
{
	public static void main(String[] args)
	{
		String str=new String("Welcome to tutorials of String");
		String subStr1=new String("tutorials");
		String subStr2=new String("Sutorials");
		System.out.println("Found Index");
		System.out.println(str.indexOf('o'));
		System.out.println("Found Index");
		System.out.println(str.indexOf('o',5));
		System.out.println("Found Index");
		System.out.println(str.indexOf(subStr1));
		System.out.println("Found Index");
		System.out.println(str.indexOf(subStr1,15));
		System.out.println("Found Index");
		System.out.println(str.indexOf(subStr2));
		System.out.println("Found Index");
		System.out.println(str.indexOf(subStr2,10));
		if(subStr1==subStr2)
		{
			System.out.println("Same substring");
		}
		
		
	}
}