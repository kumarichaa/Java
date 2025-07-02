class CaseSensitive
{
	public static void main(String[] args)
	{
		String s="MYSELF RICHA";
		String s1="myself richa";
		//String s2=s.compareTo(s1);
		boolean s2 = s.equalsIgnoreCase(s1);
		System.out.println(s2);
		System.out.println();
	}
}


//Conclusion: It is obvious by looking at the output that the outcome is not equal to zero.
 //Hence, the compareTo() method takes care of the case sensitiveness of characters.