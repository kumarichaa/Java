class SingleRepetedNumber
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,1,3,4,5,3,2,6,7,8,9,6,7};
		int res=a[0];
		for(int i=1;i<a.length;i++)
		{
			res=res^a[i];
			
		}
		System.out.println(res);
	}
}
