/*Static methods in interfaces*/
interface My
{
static void show()
{
System.out.println("My");
}
}
class Chillddd// extends My
{
public static void main(String... s)
{
My.show();//compilation error
}
}
/* In static methods are not inherited in case of interfaces*/