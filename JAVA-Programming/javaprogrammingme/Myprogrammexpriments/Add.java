import java.util.Scanner;
class Add
{
	void addition()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number:");
		int x=s.nextInt();
		
		System.out.print("Enter second number:");
		int y=s.nextInt();
		
		int Sum=x+y;
		System.out.print(Sum);
		//return Sum;
		
	}
	public static void main(String[] args)
	{
		Add a=new Add();
		a.addition();
	}
}