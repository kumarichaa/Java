class CallingChain
{
	void show()
	{
		int x=10/0;
	}
	void display()
	{
		show();
	}
	void xyz()
	{
		display();
	}
	public static void main(String[] args)
	{
		try
		{
			new CallingChain().xyz();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}