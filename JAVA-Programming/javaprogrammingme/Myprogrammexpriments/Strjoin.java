//String concatenation using String.join() method (Java Version 8+)

//The String.join() method is available in Java version 8 and all the above versions. 
//String.join() method accepts arguments first a separator and an array of String objects.

class Strjoin
{
	public static void main(String[] args)
	{
		String s1=new String("Hello");
		String s2=new String(" java String");
		String s=String.join("",s1,s2);
		System.out.println(s.toString());
	}
}
