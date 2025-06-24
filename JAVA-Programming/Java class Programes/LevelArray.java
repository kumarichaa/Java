import java.util.*;
public class LevelArray
{
	//int z[]=new int[10];
	//int z[]={10,20,30,40};
	int z[];
	public static void main(String args[])
	{
		System.out.println("Enter the size of an array");
		int x1=new Scanner(System.in).nextInt();
		LevelArray o1=new LevelArray();
		o1.z=new int[x1];
		//System.out.println(o1.z[i].getclass().getName());
		for(int i=0;i<o1.z.length;i++)
		{
			o1.z[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<o1.z.length;i++)
		{
			System.out.print(o1.z[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		for(int x:o1.z)
		{
			System.out.print(x);
			System.out.print(" ");
		}
	}

}