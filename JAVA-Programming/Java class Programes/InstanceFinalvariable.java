class InstanceFinalvariable
{
final int x=20;
public static void main(String... s)
{
InstanceFinalvariable t=new InstanceFinalvariable();
t.x=t.x+10;
System.out.println(t.x);
InstanceFinalvariable t1=new InstanceFinalvariable();
t1.x=t.x+10;
System.out.println(t1.x);
}
}