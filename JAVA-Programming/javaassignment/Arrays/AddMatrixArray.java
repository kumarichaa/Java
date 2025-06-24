import java.util.Scanner.*;
public class AddMatrixArray
{
public static void main(String[] args)
{
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	int[][] c=new int[3][3];
	//int[][] z;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the value of first array");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=x.nextInt();;
			
			System.out.print(a[i][j]+" ");
			
		}
	}
}
}