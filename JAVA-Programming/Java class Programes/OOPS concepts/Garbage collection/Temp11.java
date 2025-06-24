class Demo
{
int x=10;
int y=20;
}
class Temp11
{
	 static void show()
	{
		Demo d2=new Demo();
	    //d2.Demo();
		System.out.println(d2.x);
		System.out.println(d2.y);
		display();
		
	}
	static void display()
	{
		Demo d3=new Demo();
		//d3.Demo();
		System.out.println(d3.x);
		System.out.println(d3.y);
	}
	public static void main(String args[])
	{
		show();
		}
		}