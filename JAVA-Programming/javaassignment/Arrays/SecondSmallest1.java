class SecondSmallest1
{
	public static void main(String[] args)
	{
		int[] a={6,8,2,4,3,1,5,7,9};
		int largest=Integer.MAX_VALUE;//2147483648
		int second_largest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<largest)
			{
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]<second_largest&&a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		if(second_largest==Integer.MAX_VALUE)
		{
			System.out.println("there is no  second smallest element in an array");
		}
		else{
			System.out.println("second smallest value is"+second_largest);
		}
	}
}


