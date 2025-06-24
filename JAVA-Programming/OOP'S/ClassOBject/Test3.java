//5steps

class Test3 implements Runnable
{
	/*public void run()
	{
		System.out.println("thread task");
	}*/
	public void start()
	{
		System.out.println("threading task");
	}
	
	public static void main(String args[])
	{
		Test2 t=new Test2();
		Thread th=new Thread(t);
		th.start();
		//t.start();//IllegalThreadStateException
	}
}