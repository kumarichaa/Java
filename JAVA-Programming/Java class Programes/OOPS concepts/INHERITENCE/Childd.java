class Base
{
 void show()
{
System.out.println("Base");
}
}
class Childd extends Base
{
int show()
{
System.out.println("Child");

}
public static void main(String... s)
{
Childd c1=new Childd();
c1.show();

} 
}