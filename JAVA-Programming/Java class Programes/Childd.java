interface My
{
void show();
}
//Interface My1
//{
//void show();
//}
class Myregister
{

public Myregister(int z)
{
z.show();
}
}

class Childd implements MY
{
public void show()
{
System.out.println("Show");
}
public static void main(String... s)
{
Childd c1=new Childd();
Myregister mr=new Myregister();
mr.show(c1);

}
}
