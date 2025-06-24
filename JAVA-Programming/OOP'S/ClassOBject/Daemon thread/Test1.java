class Test1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(2000);
				System.out.println(i);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			//System.out.println(i);
		}
	}

}