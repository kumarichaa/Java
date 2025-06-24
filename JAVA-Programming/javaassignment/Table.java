class Table
{
public static void main(String args[])
{
System.out.println("Enter a number");
int x=new java.util.Scanner(System.in).nextInt();
int i=1;

while(i<=100)
{
int s=x*i;
System.out.println(s);
i++;
}

}
}