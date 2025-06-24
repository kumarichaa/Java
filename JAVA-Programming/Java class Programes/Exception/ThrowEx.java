class ThrowEx
{
	int age;
	void getAge(int age)
	{
		if(age<18)
		{
			try
			{
				throw new ArithmeticException("Invalid age");
			}
			catch(ArithmeticException e)
			{
				//System.out.println(e.getmessage());
				System.out.println(e);
			}
		}
		else
		{
			this.age=age;
		}
	}
	public static void main(String[] args)
	{
		new ThrowEx().getAge(10);
	}
}