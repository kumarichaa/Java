import java.util.Scanner;
class Divisible3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a=s.nextInt();
		if(a%3==0)
		{
			System.out.println("Number is divisible by 3.");
		}
		else
		{
			System.out.println("Number is not divisible by 3.");
		}
		
	}
}
