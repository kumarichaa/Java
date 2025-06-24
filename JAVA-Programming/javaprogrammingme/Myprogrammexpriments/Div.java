import java.util.Scanner;
class Div
{
	void div()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number:");
		int x=s.nextInt();
		System.out.print("Enter second number:");
		int y=s.nextInt();
		try
		{
		int D=x/y;
		
		System.out.println("Divide is "+D);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Hello.....");
	}
	public static void main(String[] args)
	{
		Div d=new Div();
		d.div();
	}
}