abstract class Vehicle
{
	abstract void start();
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("Start with keys.");
	}
}
class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("Start with kick.");
	}
	public static void main(String[] args)
	{
		//Vehicle v=new Vehicle();
		Car c=new Car();
		c.start();
		
		Scooter s=new Scooter();
		s.start();
	}
}
