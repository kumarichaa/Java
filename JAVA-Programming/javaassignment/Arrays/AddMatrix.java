import java.util.Scanner.*;
class AddMatrix
{
public static void main(String[] args)
{
int[][] a=new int[3][3];
int[][] b=new int[3][3];
int[][] c=new int[3][3];
Scanner x=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=x.nextInt();
	}
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(a[i][j]);
	}
	System.out.println(" ");
}
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		b[i][j]=x.nextInt();
	}
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.print(b[i][j]);
	}
	System.out.println(" ");
}
}
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