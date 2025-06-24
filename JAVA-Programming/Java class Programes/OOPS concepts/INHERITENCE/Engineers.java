class Engineering
{
void show()
{
System.out.println("A field of technology which founds many braches like cs,it........and many more");
}
}
Class Engineers extends Engineering
{
void show()
{
System.out.println("CS branch belongs to computer science");

}
public static void main(String... s)
{
Engineers e1=new Engineers();
e1.show();
}
}