class DemoSleep extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
				System.out.println(Thread.currentThread().getName());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		DemoSleep ds=new DemoSleep();
		ds.run();
		DemoSleep ds1=new DemoSleep();
		ds1.run();
	}
}