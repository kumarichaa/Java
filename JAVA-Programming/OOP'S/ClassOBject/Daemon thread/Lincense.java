class Medical extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=0;i++)
			{
				System.out.println("Medical starts");
				Thread.sleep(4000);
				System.out.println("Medical completed");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class TestDrive extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=0;i++)
			{
				System.out.println("Start test drive");
				Thread.sleep(5000);
				System.out.println("Test drive is completed");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
}
class Officer extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=0;i++)
			{
				System.out.println("Start verificiation like officer signature");
				Thread.sleep(4000);
				System.out.println("Lincense is completed by officer");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class Lincense extends Thread
{
	public static void main(String[] args)throws InterruptedException
	{
		Medical m=new Medical();
		m.start();
		m.join();
		
		TestDrive td=new TestDrive();
		td.start();
		td.join();
		
		Officer o=new Officer();
		o.start();
		o.join();
		
		System.out.println("Finallized lincense.");
		
		
	}
}  