import java.util.Scanner;
class EvenNumber
{
	void show()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int x=s.nextInt();
		//System.out.print("Enter 2nd number:");
		//int y=s.nextInt();
		
		if(x&0)
		{
			System.out.println("EvenNumber");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	public static void main(String[] args)
	{
		EvenNumber en=new EvenNumber();
		en.show();
	}	
}