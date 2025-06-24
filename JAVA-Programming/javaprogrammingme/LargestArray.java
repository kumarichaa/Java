import java.util.*;
public class LargestArray
{
public static void main(String[] args)
{
	int[] a;
	System.out.println("Enter the size of an array");
	int x=new Scanner(System.in).nextInt();
	a=new int[x];
	for(int i=0;i<a.length;i++)
	{
		a[i]=new Scanner(System.in).nextInt();
		//System.out.print(a[i]+",");
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>a[i+1])
		{
		System.out.print(a[i]);
		}
	System.out.print(" ");
	}
}
}