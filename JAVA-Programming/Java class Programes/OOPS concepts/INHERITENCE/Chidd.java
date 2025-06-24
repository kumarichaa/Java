class Base
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}

}
class Chidd extends Base
{
void get(int x,int y)
{
	this.x=x;
	this.y=y;
}	

public static void main(String args[])
{
Chidd c=new Chidd();
c.get(10,20);
c.show();
}
}

