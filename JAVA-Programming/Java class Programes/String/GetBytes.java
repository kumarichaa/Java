public class GetBytes
{
	public static void main(String args[])
	{
		String s=new String("Welcome to tutorials of java string");
		try
		{
			byte[] s1=s.getBytes();
			for(int i=0;i<s1.length;i++)
			{
				System.out.print(s1[i]+" ");
			}
		}
			catch(Exception e)
			{
				System.out.println("Unsupported character set");
			}
		
	}
}