import java.util.Scanner;
class AreaCircle
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter radius of circle:");
		int r=s.nextInt();
		final double y=3.14;
		int area=y*r*r;
		
		System.out.println("Area of circle is: "+area);
	}
}