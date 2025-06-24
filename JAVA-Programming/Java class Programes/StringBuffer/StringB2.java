class StringB2
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		//StringBuffer sb=new StringBuffer(20);
		//StringBuffer sb=new StringBuffer("ducat");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1=sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("After append");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.append("q"));
		System.out.println("After second append");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		
	}
}