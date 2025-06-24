import java.io.*;
import java.net.*;
public class MyClient
{
	public static void main(String[] args)
	{
		try
		{
		Socket s=new Socket("local host",20);
		s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
