import java.util.Scanner;
class Multiple
{
	void multiple()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number:");
		int x=s.nextInt();
		
		System.out.print("Enter second number:");
		int y=s.nextInt();
		int M=x*y;
		System.out.println("Multiplication is "+M);
		
	}
	public static void main(String[] args)
	{
		Multiple m=new Multiple();
		m.multiple();
	}
}