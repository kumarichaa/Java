
package Arrays;

import java.util.ArrayList;
class EvenOddNumbers
{
	public static void main(String[] args)
	{
		int[] a={8,5,10,3,1,4,12,90,78,77,57,23,19,20};
		ArrayList<Integer>al1=new ArrayList<>();
		ArrayList<Integer>al2=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		System.out.println("Print even numbers");
		int total1=0;
		for(int n:al1)
		{
			System.out.print(n+" ");
			
			total1=total1+n;
			
		}
		System.out.println(" ");
		System.out.println(al1.size());
		System.out.println(total1);
		
		System.out.println("Print odd numbers");
		int total2=0;
		for(int m:al2)
		{
			System.out.print(m+" ");
		;
			total2=total2+m;
			
		}
		System.out.println(" ");
		System.out.println(al2.size());
		System.out.println(total2);
	}

}