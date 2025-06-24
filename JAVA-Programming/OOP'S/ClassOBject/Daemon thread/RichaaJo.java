class RichaaJo extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread"+ i);
				Thread.sleep(1000);
				//Thread.currentThread().join();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)  //throws InterruptedException
	{
		RichaaJo r=new RichaaJo();
		r.start();
		
		//r.join();
		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main thread"+ i);
				Thread.sleep(1000);
				//r.join();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}