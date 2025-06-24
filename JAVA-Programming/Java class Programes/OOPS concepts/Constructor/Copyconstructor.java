class Copyconstructor
{
int x;
int y;
Copyconstructor(int x,int y)
{
this.x=x;
this.y=y;

}
Copyconstructor(Copyconstructor z)
{
this.x=z.x;
this.y=z.y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String... s)
{
Copyconstructor c1=new Copyconstructor(10,20);
c1.show();
Copyconstructor c2=new Copyconstructor(c1);
c2.show();
}
}