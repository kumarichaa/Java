class TwoDArray
{
public static void main(String... s)
{
	int[][] b;
	b=new int[2][];
	System.out.println(b);
	System.out.println(b.length);
	int[][] a={{10,20,30,40},{200,54,67}};
	System.out.println(a);
	System.out.println(a[0].length);
	System.out.println(a[1].length);
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+",");
		}
		System.out.println(" ");
	}
}
}