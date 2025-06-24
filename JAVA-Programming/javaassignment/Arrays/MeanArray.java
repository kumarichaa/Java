class MeanArray
{
	public static void main(String[] args)
	{
		int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
		int Sum=0;
		int A;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ,");
			Sum=Sum+a[i];
			//System.out.println(" ");
			
		}
		System.out.println(" ");
		System.out.println(Sum);
		A=Sum/a.length;
		System.out.println(A);
		
	}

}