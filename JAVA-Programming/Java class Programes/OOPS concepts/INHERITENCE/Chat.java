class Msg
{
	void show()
	{
System.out.println("Hello");
}
}
class Chat extends Msg
{
void show()
{
System.out.println("Welcome");
super.show();

}
public static void main(String args[])
{
Chat c=new Chat();
c.show();
}
}