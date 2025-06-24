class BookTheaterSeat
{
	int total_seats=10;
	//synchronized  (Synchronized method) 
	void bookSeat(int seats)
	{
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		synchronized(this) //Synchronized block(object reference expresion)
		{
		if(total_seats>=seats)
		{
			System.out.println("Seats booked successfully");
			total_seats=total_seats-seats;
			System.out.println("Seats left"+total_seats);
		}
		else
		{
			System.out.println("Seats cannot be booked.");
			System.out.println("Seats left"+total_seats);
		}
		}
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
		System.out.println("Hi: "+Thread.currentThread().getName());
	}
}
class MovieBookTicket extends Thread
{
	static BookTheaterSeat b;
	int seats;
	
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args)
	{
		b=new BookTheaterSeat();
		
		MovieBookTicket amit=new MovieBookTicket();
		amit.seats=7;
		amit.start();
		
		MovieBookTicket himanshu=new MovieBookTicket();
		himanshu.seats=6;
		himanshu.start();
		
		//MovieBookTicket richa=new MovieBookTicket();
		//richa.seats=18;
		//richa.start();
		
	}
}