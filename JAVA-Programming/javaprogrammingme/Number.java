class Number
{
public static void main(String... s)
{
System.out.println("Enter a number");
int x=new java .util.Scanner(System.in).nextInt();
if(x>0)
{
	System.out.println("Number is positive");
}
else if(x<0)
{
	System.out.println("Number is negative");
}

else
{
System.out.println("Number is zero");	
}

}
}