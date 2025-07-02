package Arrays;

class MissingNumber
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,6,7,8,10,9};
		int Sum=0;
		int exp_no_elements=a.length+1;
		
		int total_sum=exp_no_elements*(exp_no_elements+1)/2;
		System.out.println(total_sum);
		System.out.println(exp_no_elements);
		for(int i=0;i<a.length;i++)
		{
			Sum=Sum+a[i];
		}
		System.out.println("Missing number is:"+(total_sum-Sum));
		
	}

}