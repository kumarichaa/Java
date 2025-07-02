class Oddnaturalnumber {
	public static void main(String... s) {
		int count = 0;
		System.out.println("Enter a number");
		int x = new java.util.Scanner(System.in).nextInt();
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}
}