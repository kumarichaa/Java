//check marriage eligibility
class Marriage
{
public static void main(String... s)
{
System.out.println("Enter age");
int A=new java .util.Scanner(System.in).nextInt();
if(A>=21|||A>=18)
{
System.out.println("Age is eligible for marriage(boys)");
}
/*
else if(A>=18)
{
System.out.println("Age is eligible for marriage(girls)");
}
*/
else
{
System.out.println("Age is not eligible for marriage(boys and girls)");
}
}
}