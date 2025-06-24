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
		String text="This is Demo of exception.";
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
	}
}
class Richa
{
	public static void main(String[] args) //throws FileNotFoundException//Abnormal terminate by jvm
	{
		ReadAndWrite rw=new ReadAndWrite();
		
		/*
		try
		{
			rw.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}*/
		
		//System.out.println("Hello");
		try{
			rw.saveFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Hii......");
	}
}