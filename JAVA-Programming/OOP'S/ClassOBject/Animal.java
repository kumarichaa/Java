class Animal
{
	public void eat()
	{
		System.out.println("I am eating.");
	}
	public static void main(String[] args)
	{
		System.out.println("1");
		Animal dog=new Animal();
		dog.eat();
		dog.run();
		Birds sp=new Birds();
		sp.fly();
	}
	public void run()
	{
		System.out.println("I am running.");
	}

}
class Birds
{
	void fly()
	{
		System.out.println("Sparrow is flying.");
	}
}
