class Tempstatic
{
Static Demo d;
static
{
System.out.println("static block from Tempstatic");
d=new Demo();
}
}
class Demo
{
void show(int x)
{
System.out.println(x);
}
}
class Temp1
{
public static void main(String... s)
{
System.out.println("main from Temp1");
Tempstatic.d.Demo(10);
}
}