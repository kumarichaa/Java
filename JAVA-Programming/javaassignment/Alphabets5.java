class Alphabets5
{
public static void main(String... s)
{
char x='A';
for(int i=1;i<=5;i++)
{
for(int j=1;j<=6-i;j++)
{
System.out.print(x);
x++;
}
System.out.println("");
x='A';
}
}
}