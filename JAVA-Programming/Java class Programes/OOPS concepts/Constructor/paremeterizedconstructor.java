class Parameterizedconstructor
{
int x;
int y;
Parameterizedconstructor(int x,int y)
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
Parameterizedconstructor p1=new.Parameterizedconstructor(10,20);
p1.show();
Parameterizedconstructor p2=new.Parameterizedconstructor(100,200);
p2.show();
}

}