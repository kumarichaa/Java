import java.util.Scanner;
class APattern
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of rows:");
		
		int a=s.nextInt();
		System.out.println("Enter number of columns:");
		int b=s.nextInt();
		for(int i=0;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				
				if(i==1&&j==1||j==2||j==3)
					{
						System.out.print("*"+" ");
				
					}
			}
			System.out.println(" ");
		}
	}
}