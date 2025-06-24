class Tables
{
void show()
{
System.out.println("Enter a number");
int x=new java.util.Scanner(System.in).nextIn();
for(int i=1;i<=10;i++)
{
int p=x*i;
System.out.println(s);
}
}
void get()
{
System.out.println("Enter a number");
int y=new java.util.Scanner(System.in).nextIn();
for(int i=1;i<=10;i++)
{
int r=y*i;
System.out.println(r);
}
void shown()
{
System.out.println("Enter a number");
int z=new java.util.Scanner(System.in).nextIn();
for(int i=1;i<=10;i++)
{
int u=z*i;
System.out.println(u);
}
}
public static void main(String... s)
{
Tables t1=new Tables();
t1.show();
Tables t2=new Tables();
t2.get();
Tables t3=new Tables();
t3.shown();
}
}