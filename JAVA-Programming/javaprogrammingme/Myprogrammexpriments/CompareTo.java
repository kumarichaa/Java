class CompareTo
{
	public static void main(String args[])
	{
		String s=new String("Richa");
		String s1=new String("richa");
		String s2=new String("Riya");
		String s3=new String("Richa");
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}