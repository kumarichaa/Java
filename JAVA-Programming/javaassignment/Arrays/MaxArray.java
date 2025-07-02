package Arrays;

class MaxArray
{
public static void main(String[] args)
{
	int[] a=new int[]{10,20,30,22,1,3,4,78};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		
		if(max<a[i])
		{
			max=a[i];
		
		//System.out.println(a[i]);
		}
	}
		System.out.println(max);
	
	
}
}