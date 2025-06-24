class Temp1
{
static Demo d;
static
{
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
Temp1.d.show(10);
System.out.println(10);
}