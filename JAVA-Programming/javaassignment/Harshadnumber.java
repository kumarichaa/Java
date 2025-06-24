class Harshadnumber
{
public static void main(String... s)
{
int S=0;
int r;

System.out.println("Enter a number");
int x=new java .util.Scanner(System.in).nextInt();
while(x!=0)
{
r=x%10;
S=S+r;
x=x/10;
}

if(x%S==0)
{
System.out.println("Number is harshad ");
}
else
{
System.out.println("Given number is not a harshad number");
}
}