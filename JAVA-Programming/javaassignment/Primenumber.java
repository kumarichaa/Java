class Primenumber
{
public static void main(String  args[])
{
System.out.println("Enter the value");
int x=new java.util.Scanner(System.in).nextInt();
int count=0;
for(int i=1;i<=x;i++)
{

int z=x%i;
if(z==0)
count++;

}
if(count==2)
{
System.out.println("Number is prime number");
}
else
System.out.println("Number is not prime number");
}
}
