import java.io.*;
class ThrowsException
{
	static void show()throws IOException
	{
		throw new IOException("throws Examples");
	}
	public static void main(String[] args)
	{
		try
		{
			show();
		}
		catch(IOException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}