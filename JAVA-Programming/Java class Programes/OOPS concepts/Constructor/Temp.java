class Temp
{
int x;
int y;
Temp(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String... s)
{
Temp t1=new Temp(10,20);
t1.show();
Temp t2=new Temp(100,200);
t2.show();
}
}