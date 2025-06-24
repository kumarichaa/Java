class Test
{
	Test(String name)
	{
		System.out.println("parametrized constrution which is created by programmer(user define)");
		System.out.println(name);
		
	}
	public static void main(String[] args)
	{
		Test t=new Test("Richa");
		//System.out.println("Default constrution which is created by compiler");
		
	}
}