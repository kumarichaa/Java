import java.util.Scanner;
class SquarePattern1
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
				if(i==2&&j==2||i==3&&j==3)
				{
					System.out.print(" ");
				}
			
				System.out.print("*"+" ");
				
			}
			System.out.println(" ");
		}
	}
}