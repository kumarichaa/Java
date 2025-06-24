//s=a+b-d*c;
import java.util.Scanner;
class Test4
{
	void sum()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number:");
		int x=s.nextInt();
		System.out.print("Enter second number:");
		
		int y=s.nextInt();
		System.out.print("Enter 3rd number:");
		int z=s.nextInt();
		
		System.out.print("Enter 4th number:");
		int c=s.nextInt();
		
		int A;
		A=x+y-z*c;
		System.out.print(A);
		
	}
	public static void main(String[] args)
	{
		Test4 t=new Test4();
		t.sum();
	}
}