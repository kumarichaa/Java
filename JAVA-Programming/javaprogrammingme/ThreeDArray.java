class ThreeDArray
{
public static void main(String... s)
{
	//int[][][] a;
	//a=new int[2][][];
	
	//int[][][] a=new int[2][][];
	int[][][] a={{{10,20},{30,40,50,60,70},{80,90,210}}};
	System.out.println(a);//classname in the form of hashcode
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[0][0].length);
	System.out.println(a[0]);
	System.out.println(a[0][0]);
	System.out.print(a[0][0][0]+",");
	System.out.print(a[0][0][1]+",");
	System.out.println(" ");
	System.out.print(a[0][1][0]+",");
	System.out.print(a[0][1][1]+",");
	System.out.print(a[0][1][2]+",");
	System.out.print(a[0][1][3]+",");
	System.out.println(" ");
	System.out.print(a[0][2][0]+",");
	System.out.print(a[0][2][1]+",");
	System.out.print(a[0][2][2]+",");
	System.out.println(" ");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			for(int k=0;k<a[i][j].length;k++)
			{
				System.out.print(a[i][j][k]+",");
			}
			System.out.println(" ");
		}
		//System.out.println(" ");
	}
	
	
}
}