class StaticC
{
	public static void main(String args[])
	{
static int x;
static
{
System.out.println("Static block");
x=new java.util.Scanner(System.in).nextInt();
}
}
}

class Statictest1
{
public static void main(String args[])
{
System.out.println("main from statictest1");
System.out.println(StaticC.x);
System.out.println("After static block from statictest1");
}
}
class Statictest2
{
public static void main(String args[])
{
System.out.println("main from statictest2");
System.out.println(StaticC.x);
System.out.println("After static block from statictest2");
}
}
