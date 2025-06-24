class Test6
{
	public static void main(String[] args)
	{
		int z=show();
		System.out.println(z);
	}
	static int show()
	{
		try
		{
			System.exit(0);
			int x=100/0;
			System.out.println(x);
			return 10;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			return 20;
		}
		
	}
}