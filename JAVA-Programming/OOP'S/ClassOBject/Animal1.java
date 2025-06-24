class Animal1
{
	void eat()
	{
		System.out.println("I am eating.");
	}
}
class Dog extends Animal1
{
	public static void main(String... s)
	{
		Dog d=new Dog();
		d.eat();
	}
}