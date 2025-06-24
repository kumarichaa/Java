import java.util.Scanner;
class Subtraction
{
	void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number:");
		int x=s.nextInt();
		
		System.out.print("Enter second number:");
		int y=s.nextInt();
		
		int S=x-y;
		
		System.out.println("Subtraction is "+S);
	}
	public static void main(String[] args)
	{
		Subtraction s=new Subtraction();
		s.sub();
	}
}