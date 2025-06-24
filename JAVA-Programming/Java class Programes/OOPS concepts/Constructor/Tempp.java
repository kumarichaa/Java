class Tempp
{
static Demo d;
static
{
	System.out.println("static from temp");
d=new Demo();
}
}
class Demo
{
void show(int x);
{
System.out.println(x);
}
}
class Temp1
{
	System.out.println("main from temp1");
Temp.d.Demo(10);
}