class Trim
{
	public static void main(String[] args)
	{
		String s="  WElcome to java with concept of String  ";
		System.out.println(s);
		System.out.println("before trim: "+s.length());
		System.out.print("Return value:");
		String z=s.trim();
		System.out.println(z);
		System.out.println("After trim: "+z.length());
		
	}
}