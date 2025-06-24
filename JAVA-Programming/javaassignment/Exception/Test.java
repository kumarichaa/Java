import java.io.FileInputStream;

class Test
{
	public static void main(String[] args)
	{
		/*
		try
		{
		FileInputStream fis=new FileInputStream("d:/abc.text");
		}
		catch(Exception e)
		{
			System.out.println(e);          //compiler check krta hai as called checked exception
		}
		*/
		/*
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		//Class.forName("com.mysql.jdbc.Driver");
		try
		{
		int a=100,b=0,c;
		c=a/b;
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		System.out.println("Hello");//without termination
		//unchecked exception(RuntimeException)
		
		//String name=null;
		//System.out.println(name.length());
	}

}
//FileInputStream use for data read 