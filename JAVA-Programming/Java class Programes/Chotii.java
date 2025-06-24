interface My
{
void show()
{
System.out.println("Show");
}
}
class Chotii implements My
{
public void show()
{
System.out.println("Show");
}
public void display()
{
System.out.println("Display");
}
public static void main(String... s)
{
My m=new My();
//m.display();
m.show();
}
}