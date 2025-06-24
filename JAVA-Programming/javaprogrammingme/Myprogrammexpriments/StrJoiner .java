//String concatenation using StringJoiner class (Java Version 8+)

//StringJoiner class has all the functionalities of String.join() method. 
//In advance its constructor can also accept optional arguments, prefix and suffix.

public class StrJoiner 
{
	public static void main(String args[])
	{
		StringJoiner s=new StringJoiner(","); //StringJoiner object
		s.add("Hello");
		s.add(" java world!");
		System.out.println(s.toString());
		
	}
}