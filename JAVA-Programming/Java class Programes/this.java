class Mythis
{
	int x=100;
	void get(int x, Mythis z)
	{
		//System.out.println(this+"Getjava");
		System.out.println(x);
		System.out.println(z.x);
		
	}
	public static void main(String... s)
	{
		Mythis mt=new Mythis();
		System.out.println(mt.x);
		mt.get(30,mt);
	}
}