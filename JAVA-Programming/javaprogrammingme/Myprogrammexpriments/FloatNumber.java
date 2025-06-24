import java.util.*;
public class FloatNumber
{
	void show()
	{
		//float a;
		System.out.println("Enter a float number:");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		//int a=20;
		
		System.out.println("Float Number is:"+a);
		
	}
	public static void main(String[] args)
	{
		FloatNumber fn=new FloatNumber();
		fn.show();
	}
}