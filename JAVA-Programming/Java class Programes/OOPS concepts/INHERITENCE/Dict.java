class Demo
{
	void show()
	{
	int x=50;
	System.out.println(x);
	}
}
class Dict extends  Demo
{
int y=40;
void show()
{
System.out.println(y);
super.show();
}
public static void main(String args[])
{
Dict d=new Dict();
d.show();
}
}