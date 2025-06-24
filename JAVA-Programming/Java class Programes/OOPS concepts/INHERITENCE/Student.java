
class Teacher
{
void show()
{
System.out.println("teaching.....");
}
}
class Student extends Teacher
{
void show()
{
System.out.println("studying....");
super.show();
}
public static void main(String... s)
{
Student s1=new Student();
s1.show();
}
}