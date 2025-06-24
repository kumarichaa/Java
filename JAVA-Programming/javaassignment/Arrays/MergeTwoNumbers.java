class MergeTwoNumbers
{
	public static void main(String[] args)
	{
		int[] a={10,20,3,4,76,12,45};
		int[] b={11,89,70,40,62,19,4};
		
		int a_leng=a.length;
		int b_leng=b.length;
		int c_leng=a_leng+b_leng;
		
		int[] c=new int[c_leng];
		int temp;
		
		for(int i=0;i<a_leng;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b_leng;i++)
		{
			c[a_leng+i]=b[i];
		}
		for(int i=0;i<c_leng;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println(" ");
		for(int i=0;i<c_leng;i++)
		{
			for(int j=0;j<c_leng-1-i;j++)
			{
				if(c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
			
		}
		System.out.println("Merging two arrays present in sorted way");
		for(int i=0;i<c_leng;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}