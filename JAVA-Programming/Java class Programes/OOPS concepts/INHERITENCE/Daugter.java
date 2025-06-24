class Mummy
{
void show()
{
System.out.println("mummy");
}
}
class Daugter extends Mummy
{
void show()
{
System.out.println("daughter");
super.show();
}
public static void main(String... s)
{
Daugter d=new Daugter();
d.show();
}
}