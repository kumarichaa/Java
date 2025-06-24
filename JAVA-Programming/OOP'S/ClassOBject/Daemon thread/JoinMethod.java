class JoinMethod
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread"+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		JoinMethod t=new JoinMethod();
		t.start();
		//jm.join();
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread"+ i);
				Thread.sleep(1000);
				//t.join();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}