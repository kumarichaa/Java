import java.io.*;
class Temp
{
	public static void main(String[] args)throws IOException
	{
		FileoutPutstream fout=new FileOutputStream("abc.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("Hello");
		ps.println("Hey");
		
	}

}