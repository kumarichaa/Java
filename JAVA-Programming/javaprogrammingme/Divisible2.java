import java.util.Scanner;
class Divisible2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is divisible by two");
		}
		else
		{
			System.out.println("Number is not divisible by two");
		}
		
	}
}
