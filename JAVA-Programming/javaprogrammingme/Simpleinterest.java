class Simpleinterest
{
public static void main(String... s)
{
int S;
System.out.println("Enter principal=");
int p=new java .util.Scanner(System.in).nextInt();
System.out.println("Enter time=");
int t=new java .util.Scanner(System.in).nextInt();
System.out.println("Enter Rate=");
int r=new java .util.Scanner(System.in).nextInt();
S=(p*t*r)/100;
System.out.println(S);
}
}
