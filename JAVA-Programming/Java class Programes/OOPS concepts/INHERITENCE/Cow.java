class Animals
{
void show()
{
System.out.println("eating");
System.out.println("braking");
}
}

class Cow extends Animals
{
String name;
int age;
void get(String s1,int s2)
{
name=s1;
age=s2;
}
void show()
{
System.out.println(name);
System.out.println(age);
}
public static void main(String args[])
{
Cow c1=new Cow();
c1.get("Black cow",23);
c1.show();
Cow c2=new Cow();
c2.get("Berry cow",33);
c2.show();
Cow c3=new Cow();
c3.get("Babyy cow",63);
c3.show();
}
}
