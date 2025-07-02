package String;

class StringBufferDemo
{
	public static void main(String[] args)
	{
		/*//constructor
		
		StringBuffer sb=new StringBuffer();
		//System.out.println(sb.capacity());//default capacity is 16
		StringBuffer sb2=new StringBuffer("deepak java");
		System.out.println(sb2.capacity());//16+string length
		StringBuffer sb1=new StringBuffer(1000);
		System.out.println(sb1.capacity());
		//StringBuffer sb3=new StringBuffer('a','b','c');
		//System.out.println(sb3.capacity());
		*/
		
		//methods
		/*
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("hello");
		System.out.println(sb.capacity());
		
		sb.append("deepak");
		System.out.println(sb.capacity());
		
		sb.append("deepak javaa");
		System.out.println(sb.capacity());
		*/
		
		StringBuffer sb=new StringBuffer("deepak java");
		System.out.println(sb.length());
		System.out.println(sb.append("hiiii....."));
		System.out.println(sb.delete(2,5));
		System.out.println(sb.charAt(4));
		System.out.println(sb.delete(2,4));
		System.out.println(sb.deleteCharAt(3));
		StringBuffer sb1=new StringBuffer("deepak java");
		System.out.println(sb.equals(sb1));
		StringBuffer sb2=sb.append("hiii");
		System.out.println(sb.equals(sb2));
		System.out.println(sb.insert(3,"zzzz"));
		System.out.println(sb.replace(3,6,"m"));
		System.out.println(sb.reverse());
		System.out.println(sb.subSequence(3,8));
		System.out.println(sb.substring(3));
		System.out.println(sb.substring(3,9));
		
		
		
		
		
		
		
	}
}