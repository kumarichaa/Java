class Test
{
	public static void main(String[] args)
	{
		Test z=new Test();
		z.show();
		System.out.println(z);
	}
	int show()
	{
		try
		{
			return 10;
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			return 20;
		}
	}
}