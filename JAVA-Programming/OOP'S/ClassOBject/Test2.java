class Test2 extends Thread
{
	public void run()
	{
		System.out.println("thread task");
	}
	public static void main(String args[])
	{
		Test2 t=new Test2();
		t.start();
		t.start();//exception
	}
}