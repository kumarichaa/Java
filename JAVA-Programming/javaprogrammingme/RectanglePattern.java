import java.util.Scanner;
class RectanglePattern
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		
		int a=s.nextInt();
		System.out.println("Enter breathe of rectangle");
		int b=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println(" ");
		}
	}
}