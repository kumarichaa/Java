class Birds
{
void show()
{
System.out.println("sparrow exits in birds group");
}
}
class Sparrow extends Birds{
void show()
{
System.out.println("Sparrow is flying in the sky");
super.show();
}
public static void main(String... s)
{
Sparrow s1=new Sparrow();
s1.show();
}
}