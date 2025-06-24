import java.util.*;
public class MatrixaddArray
{
	public static void main(String[] args)
	{
		int[][] a=new int[][]{{10,20,30},{40,50,60},{90,30,20}}; 
		int[][] b=new int[][]{{10,20,30},{40,50,60},{90,20,30}};
		int[][] c=new int[3][3];
		System.out.println("Enter the first matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(a[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("Enter second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(b[i][j]);
			System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("Sum of First and second array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}