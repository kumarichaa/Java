import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
	}
}
class Richa
{
	public static void main(String[] args)
	{
		ReadAndWrite rd=new ReadAndWrite();
		try
		{
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}