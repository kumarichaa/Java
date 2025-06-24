class Alphabets6
{
public static void main(String... s)
{
char x='A';
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(x);
x++;
}
System.out.println("");
x='A';
}
}
}