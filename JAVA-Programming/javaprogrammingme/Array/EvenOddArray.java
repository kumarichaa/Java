class EvenOddArray
{
	public static void main(String[] args)
	{
		int[] a=new int[]{1,2,43,76,87,2,20,30,98,67,55,42,11,88,100,102,101,113};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			//System.out.println(" ");
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
				//System.out.println(" ");
			}
			//System.out.println(" ");
			/*else
			{
				System.out.print(a[i]+" ");
				//System.out.println(" ");
			}
			*/
			
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}