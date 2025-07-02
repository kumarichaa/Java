class Test
{
	void show()throws RuntimeException  
	{
		System.out.println("Richa");
		//return null;
	}
}
class Test1 extends Test
{
	void show()throws Exception     
	{
		System.out.println("2");
		//return null;
	}
	public static void main(String[] args) throws Exception
	{
		Test t=new Test();
		t.show();
		Test1 t1=new Test1();
		t1.show();
	}
}