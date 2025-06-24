class Demo
{
	int x=10;
	int y=20;
	//static Demo z;
	public void finalize() throws Throwable
	{
		//z=this;
		System.out.println("Jawaan saheed");
	}

}
class Temp10
{
	static void show()
	{
		Demo d2=new Demo();
		display();
		//d2.Demo();
	}
	static void display()
	{
		Demo d3=new Demo();
	}
	public static void main(String args[])
	{
		/*show();
		for(int i=1;i<=2000;i++)//90%chance to show the finalized keyword show
		{
			
		}*/
		//System.gc();//static method
		//RunTime.gc();//static method
		new Demo();//Anonymous object
	}
}