class Viamethod
{
int x=getx();
int getx()
{
System.out.println(x);
return 20;
}
Viamethod()
{
//x=0;
//x=getx();
System.out.println(x);
}
public static void main(String... s)
{
new Viamethod();
}
}