class SecondLargest1
{
	public static void main(String[] args)
	{
		int[] a={6,814,2,4,3,1,5,700,987};
		int largest=Integer.MIN_VALUE;//-2147483648
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]>second_largest&&a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("there is no  second largest element in an array");
		}
		else{
			System.out.println("second largest value is"+second_largest);
		}
	}
}