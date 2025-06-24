class Base
{
int x=20;
void show()
{
System.out.println("Baes");
}
}
class Chilldd extends Base
{
int x=80;
void show()
{
System.out.println("Chilldd");
}
void display()
{
System.out.println("Display");
}
public static void main(String... s)
{
Base b=new Chilldd();//upcasting
b.show();
Chilldd c=(Chilldd)b;//downcasting
c.display();
System.out.println(b.x);
}
} 