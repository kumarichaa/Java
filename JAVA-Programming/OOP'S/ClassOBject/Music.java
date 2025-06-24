class Music extends Thread
{
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		System.out.println("Thread task:"+Thread.currentThread().getName());
	}
public static void main(String[] args)
{
System.out.println("Hello is printed by"+Thread.currentThread().getName());
//System.out.println(Thread.currentThread().getName());
Thread.currentThread().setDaemon(true);
System.out.println(Thread.currentThread().getName());
//System.out.println(10/0);
Music m=new Music();
m.start();
m.setName("Richa2");

Music m2=new Music();
m2.start();
m2.setName("Riya");
System.out.println(m.isAlive());
}
}
