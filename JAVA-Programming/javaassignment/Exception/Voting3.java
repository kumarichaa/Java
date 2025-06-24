//checked exception(Run time exception)

import java.util.Scanner;
class UnderAgeException extends RuntimeException
{
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}
class Voting3
{
	public static void main(String[] args)//throws UnderAgeException
	{
		System.out.print("Enter an age for voting:");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		
		try
		{
		
			if(a<18)
			{
				throw new UnderAgeException("you cannot vote as your age required");
			//System.out.println("you are not eligibiable for voting.");
			}
			else
			{
				System.out.println("you are eligibiable for voting.");
			}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hello");
	}
}