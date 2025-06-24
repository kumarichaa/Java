class NewException
{
	public static void main(String... s)
	{
		try
		{
			try
			{
			int x=10/s.length;
			System.out.println(x);
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Hello");
			}
			int[] z=new int[s.length];
			z[10]=100;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Hiii....");
			
		}
	}

}