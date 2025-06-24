class Test4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+ i);
		}
	}
	public static void main(String[] args)
	{
		Test4 t4=new Test4();
		t4.start();
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			Thread.yield();
			System.out.println("main thread" + i);
		}
		
	}
}
