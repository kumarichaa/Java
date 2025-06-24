class Temp1
{
	private final int x;
	private void  Temp(int x)
	{
		this.x=x;
	}
	void show()
	{
		System.out.println(x);
	}
	public static Temp1 getInstance(int z)
	{
		return new Temp1(z);
		
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Temp1 t=Temp1.getInstance(10);
		t.show();
	}
}

