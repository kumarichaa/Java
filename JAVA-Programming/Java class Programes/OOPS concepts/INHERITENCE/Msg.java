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
}
public static void main(String... s)
{
Chat c=new Chat();
c.show();
}
}