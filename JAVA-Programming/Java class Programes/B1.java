//final keyword through construction
class B1
{
final int x;
B1(int z)
{
//System.out.println(x);
x=z;
System.out.println(z);
}
public static void main(String... s)
{
B1 b1=new B1(300);
//b1.x=60;
B1 b2=new B1(200);
}
}