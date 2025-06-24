class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
			System.out.println("MyThread1");
			}
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("MyThread1 dead");
	}
	
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("MyThread2");
		}
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("MyThread2 dead");
	}
	
}
class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println("MyThread3");
		}
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("MyThread3 dead");
	}
	
}
class Main
{
	public static void main(String[] args)
	{
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		MyThread3 mt3=new MyThread3();
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
}