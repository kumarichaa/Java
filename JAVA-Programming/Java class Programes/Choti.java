//Via interface
interface My
{
int x=10;
}
interface My1
{
int x=19;
}
interface My2
{
int x=99;
}
interface My3
{
int x=109;
}
interface My4
{
int x=29;
}
class Choti implements My,My1,My2,My3,My4
{
public static void main(String... s)
{
System.out.println(My.x);
System.out.println(My1.x);
System.out.println(My2.x);
System.out.println(My3.x);
//System.out.println(x);
System.out.println(My4.x);
}
}