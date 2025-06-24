import java.util.Scanner;
class Divisible4
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int a=s.nextInt();
		if(a%4==0)
		{
			System.out.println("Number is divisible by 4.");
		}
		else
		{
			System.out.println("Number is not divisible by 4.");
		}
		
	}
}
