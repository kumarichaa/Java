//import java.util.Scanner.*;
package Arrays;
 

class BubbleSort
{
	public static void main(String[] args)
	{
		int[] x=new int[]{36,19,29,12,5};
		int temp;
		/*int[] x;
		System.out.println("Enter the size of an array");
		int x1=new java.util.Scanner(System.in).nextInt();
		x=new int[x1];
		int temp;
		System.out.println("Enter the value of an array");
		for(int i=0;i<x.length;i++)
		{
			x1[i]=new java.util.Scanner(System.in).nextInt();
			System.out.print(x1[i]+" ");
		}*/
		for(int i=0;i<x.length;i++)
		{
			int flag=0;
			for(int j=0;j<x.length-1;j++)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					flag=1;
					
				}
			}
			if(flag==0)
			{
				break;
			}
		}
			for(int i=0;i<x.length;i++)
			{
			System.out.print(x[i]+" ");
			}
		
	}
}