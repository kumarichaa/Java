class TotalEarning extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=20;i++)
			{
				total=total+100;
			}
		this.notify();
		}
	}
}
class MovieApp
{
	public static void main(String[] args)throws InterruptedException
	{
		TotalEarning te=new TotalEarning();
		te.start();
		///te.join();
		synchronized(te)
		{
			te.wait();
		}
		System.out.println("Total earning is: "+te.total+"Rs");
	}
}