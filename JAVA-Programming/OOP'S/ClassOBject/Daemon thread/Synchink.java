class BookTheaterApp
{
	int total_seats=20;
	//synchronized  (Synchronized method) 
	synchronized void bookSeat(int seats)
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
}
class MyThread1 extends Thread
{
	BookTheaterApp b;
	int seats;
	MyThread1(BookTheaterApp b,int seats)
	{
		this.b=b;
		this.seats=seats;
		
	}
	public void run()
	{
		b.bookSeat(seats);
	}
	
}
class MyThread2 extends Thread
{
	BookTheaterApp b;
	int seats;
	MyThread2(BookTheaterApp b,int seats)
	{
		this.b=b;
		this.seats=seats;
		
	}
	public void run()
	{
		b.bookSeat(seats);
	}
	
}

public class MovieBookTicket 
{
	static BookTheaterSeat b;
	int seats;
	
	public void run()
	{
		b.bookSeat(seats);
	}
	public static void main(String[] args)
	{
		BookTheaterApp b1=new BookTheaterApp();
		MyThread1 t1=new MyThread1(b1,7);
		t1.start();
		
		MyThread2 t2=new MyThread2(b1,8);
		t2.start();
		//---------------------------------------
		
		BookTheaterApp b1=new BookTheaterApp();
		MyThread1 t1=new MyThread1(b1,7);
		t1.start();
		
		MyThread2 t2=new MyThread2(b1,8);
		t2.start();
		
	}
}