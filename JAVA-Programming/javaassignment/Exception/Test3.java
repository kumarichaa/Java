class Test3
{
	public static void main(String[] args)
	{
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		/*catch(ArithmeticException ae)
		{
			//ae.printStackTrace();// print all(exception name ,description, Stacktrace)
			System.out.println(ae);//exception name ,description, not print Stacktrace
			//System.out.println(ae.toString);exception name ,description, not print Stacktrace
			//System.out.println(ae.getMessage());exception name ,only print description, Stacktrac)
		}
		*/
		finally
		{
			System.out.println("I am in finally block.");
		}
	
	}	

}