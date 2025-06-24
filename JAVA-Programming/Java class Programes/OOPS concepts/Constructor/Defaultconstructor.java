class Defaultconstructor
{
int x;
int y;
Defaultconstructor()
{
x=10;
y=20;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String... s)
{
Defaultconstructor d1=new Defaultconstructor();
d1.show();
Defaultconstructor d2=new Defaultconstructor();
d2.show();

}

}