class Multiplefunctions
{
void add(int a,int b)
{
int S;
S=a+b;
System.out.println(S);
}
void addd()
{
	int R;
	System.out.println("Enter value of p=");
int p=new java .util.Scanner(System.in).nextInt();
System.out.println("Enter value of q");
int q=new java .util.Scanner(System.in).nextInt();
R=p+q;
System.out.println(R);
}
void evenoddnumber()
{
System.out.println("Enter a number");
int x=new java .util.Scanner(System.in).nextInt();
if(x%2==0)
{
System.out.println("Number is even");
}
else
{
System.out.println("Number is odd");
}
}
void naturalnumber()
{
System.out.println("Enter a number");
int n=new java .util.Scanner(System.in).nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(i);
}
}
public static void main(String... s)
{
Multiplefunctions mf=new Multiplefunctions();
/*mf.add(10,20);
mf.evenoddnumber();
mf.naturalnumber();*/
mf.addd();
}
}