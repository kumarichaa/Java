class Neonnumber
{
public static void main(String... s)
{
int S;
int r;
int m=0;
int C;
System.out.println("Enter a number");
int x=new java .util.Scanner(System.in).nextInt();
S=x*x;
while(S!=0)
{
r=S%10;
m=m+r;
S=S/10;
}
C=m;
if(C==x)
{
System.out.println("Number is neonnumber");
}
else
{
System.out.println("Number is not neonnumber");
}
}
}