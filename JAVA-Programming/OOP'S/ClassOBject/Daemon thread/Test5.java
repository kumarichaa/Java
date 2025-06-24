public class Test5 extends Thread
{
	public void run()
	{
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				//Thread.sleep(1000);
				//System.out.println(Thread.interrupted());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		t.start();
		
		//t.interrupt();
	}	
}