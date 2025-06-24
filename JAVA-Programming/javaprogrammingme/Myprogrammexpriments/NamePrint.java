//used close() method
import java.util.Scanner;
public class NamePrint
{
	public static void main(String[] args)
	{
		
		System.out.print("Enter your name:");
		Scanner str=new Scanner(System.in);
		String name=str.next();
		
		System.out.println("Scanner open......");
		System.out.println("Name:"+name);
		str.close();
		
		System.out.println("Scanner closing.......");
	}
}