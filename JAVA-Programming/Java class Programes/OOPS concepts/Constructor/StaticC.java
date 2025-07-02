class StaticC {
	public static void main(String args[]) {
		 int x;
		{
			System.out.println("Static block");
			static int x = new java.util.Scanner(System.in).nextInt();
		}
	}
}

class Statictest1 {
	public static void main(String args[]) {
		System.out.println("main from statictest1");
		System.out.println(StaticC.x);
		System.out.println("After static block from statictest1");
	}
}

class Statictest2 {
	public static void main(String args[]) {
		System.out.println("main from statictest2");
		System.out.println(StaticC.x);
		System.out.println("After static block from statictest2");
	}
}
