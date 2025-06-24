import java.util.*;
public class LevelArray1
{
public static void main(String... d)
{
	//int z[]=new int[10];
	//int z[]=new={10,20,30,40,50};
	int z;
	System.out.println("Enter the size of array");
	int x1=new Scanner(System.in).nextInt();
	z=new int [x1];
	for(int i=0;i<z.lenth;i++)
	{
		z[i]=new Scanner(System.in).nextInt();
	}
	for(int i=0;i<z.lenth;i++)
	{
		System.out.print(z[i]);
		System.out.print(" ");
	}
}
}