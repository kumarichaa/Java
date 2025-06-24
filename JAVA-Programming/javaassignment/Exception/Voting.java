import java.util.Scanner;
class YoungerAgeException extends RuntimeException// unchecked exception
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
	

}
class Voting 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age=s.nextInt();
		try
		{
		if(age<18)
		{
			throw new YoungerAgeException("You are not eligiliable for voting");
			System.out.println("Hello Richa.....");
		}
		else
		{
			System.out.println("You are successfully eligiliable for voting");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Hiii....."+"Days");
	}
}