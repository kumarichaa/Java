class SecondLargest
{
	public static void main(String[] args)
	{
		int[] a={6,2,7,1,4,10,5,3,2};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			if(i==1)
			{
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		System.out.println("SecondLargest element is"+a[1]);
	}

}