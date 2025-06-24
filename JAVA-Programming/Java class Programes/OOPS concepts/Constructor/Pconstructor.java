class Pconstructor
{
int x;
int 
Pconstructor(int x,int y)
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
Pconstructor p1=new Pconstructor(10,20);
p1.show();
Pconstructor p2=new Pconstructor(100,200);
p2.show();
}

}