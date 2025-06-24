/*instance functions,instance methods in interfaces*/
interface My
{
default void show()
{
System.out.println("My");
}
}
interface My1
{
	default void show()
	{
		System.out.println("display");
	}
}
class Richaa implements My,My1
{
	public void show()
	{
		System.out.println("Richaa");
	}
public static void main(String... s)
{
My m=new Richaa();
m.show();
My1 m1=new Richaa();
m1.show();
}
}