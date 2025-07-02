
package Arrays;

class MedianArray {
	public static void main(String[] args) {
		int[] a = new int[] { 14, 1, 10, 20, 30, 4, 50, 6, 70, 8, 0, 100 };
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				System.out.println(a[i]);
			}

		}
		System.out.println(" ");

	}

}