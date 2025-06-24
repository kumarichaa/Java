class StringBuilderDemo
{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Richaaa");
		System.out.println(sb.capacity());
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.capacity());
	}
}