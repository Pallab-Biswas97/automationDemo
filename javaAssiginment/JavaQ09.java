package javaAssiginment;

class findLargest {
	int getLargest(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length - 1];
	}
}

public class JavaQ09 {
	public static void main(String args[]) {
		int[] arr1 = { 2, 4, 5, 6, 7, 8, 4, 2, 8, 3 };
		findLargest checkLargest = new findLargest();
		int largest = checkLargest.getLargest(arr1);
		System.out.println("The largest number - " + largest);
	}
}
