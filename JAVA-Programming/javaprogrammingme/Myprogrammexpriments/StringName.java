//used close() method
import java.util.Scanner;
public class NamePrint
{
	public static void main(String[] args)
	{
		String name;
		System.out.print("Enter your name:");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		
		System.out.println("Scanner open......");
		System.out.println("Name:"+name);
		s.close();
		
		System.out.println("Scanner closing.......");
	}
}