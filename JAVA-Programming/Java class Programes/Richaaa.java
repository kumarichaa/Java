interface My
{
void show()
{
system.out.println("My");
}
}
interface My1 extends My
{
void display()
{
System.out.println("My1");
}
}
/*interface My2 extends My1
{
void get();
{
System.out.println("My2");
}
}*/
class Richaaa implements My,My1
{
public static void main(String... s)
{
public void show()
public void display()
//public void get();
{
System.out.println("Show");
System.out.println("Display");
//System.out.println("Get");
}
My m=new Richaaa();
m.show();
My1 m1=new Richaaa();
m1.display();
//My2 m2=new Richaaa();
//m2.get();
}
}