class A
{
A()
{
System.out.println("A");
}
}
class B extends A
{
B()
{
System.out.println("B");
}
B(int x)
{
	System.out.println(x);
}
}
class C extends B
{
C()
{
	super(10);
System.out.println("c");

}
C(int x)
{
System.out.println(x);
}
public static void main(String... s)
{
new C();
new C(12);
}
}