class A
{
{
System.out.println("Init block of class A");
}
A()
{
System.out.println("A");
}
}
class B extends A
{
{
System.out.println("Init block of class B");
}
B()
{
System.out.println("B");
}
}
class CC extends B
{
{
System.out.println("Init block of class C");
}
CC()
{

System.out.println("C");
}
CC(int x)
{
	
System.out.println(x);
}
public static void main(String... s)
{
//new CC();
new CC(72);
}
}