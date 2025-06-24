/*instance functions,instance methods in interfaces*/
interface My
{
default void show()
{
System.out.println("My");/*default is represented instance methods in interfaces*/
}
}
interface My1
{
	default void display()
	{
		System.out.println("display");
	}
}
class Richa implements My,My1
{
public static void main(String... s)  //main static hota hain//
{
My m=new Richa();
m.show();
My1 m1=new Richa();
m1.display();
}
}

/*Interface ke body ko override krna manadotry nhii hain jabki more than instance methods same ho tb override krte hain
and jab overide krte hain tb main functions wale print hote hain.*/