class Factorial
{
public static void main(String  args[])
{
System.out.println("Enter the value");
int x=new java.util.Scanner(System.in).nextInt();
int f=1;

while(x>=1)
{

 f=f*x;
 x--;
}


System.out.println(f);

}

}