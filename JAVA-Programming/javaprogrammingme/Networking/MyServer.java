import java.io.*;
import java.net.*;
public class MyServer
{
	public static void main(String[] args)
	{
		try
		{
		ServerSocket ss=new ServerSocket(20);
		Socket s=ss.accept();
		ss.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception not reported");
		}
	}
}
