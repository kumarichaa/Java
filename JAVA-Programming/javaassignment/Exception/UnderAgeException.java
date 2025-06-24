import java.util.Scanner;
class UnderAgeException extends Exception
{
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String message)
	{
		super("message");
	}
}
class Voting
{
	public static void main(String[] args)
	{
		System.out.print("Enter an age for voting:");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
	}
}