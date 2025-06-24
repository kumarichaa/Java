class Initblock
{
	
int x;
{
this.x=10;
System.out.println("Init block");
}	
Initblock()
{
System.out.println("Default");
System.out.println(x);
}
Initblock(int y)
{
System.out.println(x+y);
}
public static void main(String... s)
{
new Initblock();
new Initblock(10);
}
}