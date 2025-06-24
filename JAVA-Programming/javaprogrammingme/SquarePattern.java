import java.util.Scanner;
class SquarePattern
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of square");
		
		int a=s.nextInt();
		for(int i=0;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println(" ");
		}
	}
}