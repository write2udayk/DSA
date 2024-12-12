package matrix2D;

import java.util.Arrays;

public class RotateMatrix90Degree2 {
	public static void main(String[] args) {
		int a[][] = { { 2, 8, 5, 3 }, { 12, 6, 19, 4 }, { 1, 4, 9, 22 }, { 3, 32, 15, 18 } };
		printArray(a);
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				// Save the top element
				int temp = a[i][j];

				// Move left to top
				a[i][j] = a[n - j - 1][i];

				// Move bottom to left
				a[n - j - 1][i] = a[n - i - 1][n - j - 1];

				// Move right to bottom
				a[n - i - 1][n - j - 1] = a[j][n - i - 1];

				// Move top (temp) to right
				a[j][n - i - 1] = temp;
			}
		}

		printArray(a);

	}

	public static void printArray(int[][] a) {
		for (int arr[] : a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
	}

}
