import java.util.Scanner;
class SwapNumbers
{
	//int temp;
	void swap()
	{
		System.out.print("Enter first number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		System.out.print("Enter Second Number:");
		int b=s.nextInt();
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("First Number:"+a);
		System.out.println("Second Number:"+b);
	}
	public static void main(String[] args)
	{
		
		SwapNumbers sn=new SwapNumbers();
		sn.swap();
		
		//System.out.println("First Number:"+a);
		//System.out.println("Second Number:"+b);
		
	}
}