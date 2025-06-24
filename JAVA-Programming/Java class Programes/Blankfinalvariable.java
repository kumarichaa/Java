class Blankfinalvariable
{
final int x=getX();
int getX()
{
System.out.println(x+"via get function");
return 10;
}
Blankfinalvariable()
{
//x=getX();
System.out.println(x+"via constructor");
}
public static void main(String... s)
{
new Blankfinalvariable();
}
}