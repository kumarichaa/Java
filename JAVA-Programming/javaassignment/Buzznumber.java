class Buzznumber
{
public static void main(String... s)
{
System.out.println("Enter a number");
int x=new java .util.Scanner(System.in).nextInt();
if(x%7==0||x%10==7)
{
System.out.println("NUmber is buzz number");
}
else
{
System.out.println("NUmber is not buzz number");
}
}
}