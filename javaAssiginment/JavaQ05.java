package javaAssiginment;

public class JavaQ05 {
	public static void main(String args[]) {
		int rows = 3, columns = 4;

		int[][] arrA = { { 2, 4, 5, 6 }, { 4, 7, 8, 9 }, { 4, 5, 2, 4 } };
		int[][] arrB = { { 3, 5, 7, 9 }, { 9, 1, 2, 6 }, { 3, 8, 4, 6 } };

		int[][] sum = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = arrA[i][j] + arrB[i][j];
			}
		}

		for (int[] row : sum) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}
}
