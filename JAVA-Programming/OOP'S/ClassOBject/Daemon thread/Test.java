public class Test extends Thread
{
	public void run()
	{
		//if(Thread.currentThread().isDaemon())
		//{
			System.out.println("daemon thread");
		//}
		//else
		//{
			//System.out.println("child thread");
		//}
	}
	public static void main(String[] args)
	{
		//System.out.println("main thread");
		
		Test t=new Test();
		t.start();
		t.setDaemon(true);
		//t.start();
	}
}