public class StringJoiner
{
	public static void main(String[] args)
	{
		StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
        s.add("Hello");    //String 1   
        s.add("World");    //String 2  
        System.out.println(s.toString());  //Displays result  
	}
}