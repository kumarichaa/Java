abstract class Base
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}
abstract void display();
}
class Myregister
{
void Myregister(Base b)
{
b.display();
}
}
class Child extends Base
{
void get(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println("display");
}
public static void main(String... s)
{
Child c1=new Child();

Myregister mr=new Myregister();
mr.Myregister(c1);
c1.get(10,20);
c1.show();

}
}