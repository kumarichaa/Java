package String;


public class StringComparison1
{
	public static void main(String[] args)
	{
		String s="deepak";
		String s1="Java";
		System.out.println(s+s1);//deepakjava
		System.out.println(s+10);//deepak10
		System.out.println(s1+20+19);//deepak2019
		//System.out.println(s1-10);//error
		System.out.println(s1+20/10);//deepak2
		
		System.out.println(s.concat(s1));//deepakjava
		System.out.println(String.join(",",s ,s1));//deepak,java
		System.out.println(String.join("zzzzzzyyyy",s,s1,s));
		
		
	}
}