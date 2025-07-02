class SumOfNaturalNumber
{
public static void main(String... s)
{
int S=0;
System.out.println("Enter a number");
int x=new java .util.Scanner(System.in).nextInt();
for(int i=1;i<=x;i++)
{
S=S+i;
}
System.out.println(S);
}
}