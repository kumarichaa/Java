class Constructorchain
{
Constructorchain()
{
this(10);
System.out.println("default");
}
Constructorchain(int x)
{
this(10,20);
System.out.println(x);
}
Constructorchain(int x,int y)
{
System.out.println(x+y);
}
public static void main(String... s)
{
new Constructorchain();
//new Constructorchain(10,20);
//new Constructorchain(10);
}

}