class StringInsert
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("I java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1=sb.insert(2,"like ");
		System.out.println(sb);
		System.out.println(sb1);
		sb1=sb.replace(2,6,"love ");
		System.out.println(sb);
		sb1=sb.delete(2,6);
		System.out.println(sb1);
		sb1=sb.reverse();
		System.out.println(sb);
		if(sb==sb1)
		{
			System.out.println("one object");
		}
		
		
	}
}