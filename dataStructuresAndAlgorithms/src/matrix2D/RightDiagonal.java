package matrix2D;

/**
 * A utility class to print the right diagonal (secondary diagonal) elements of
 * a square 2D matrix. It demonstrates two different methods to perform this
 * task: one using a for-loop and the other using a while-loop.
 */
public class RightDiagonal {

	/**
	 * The main method demonstrates the use of two methods for extracting and
	 * printing the right diagonal elements of a square 2D matrix.
	 *
	 * @param args command-line arguments (not used).
	 */
	public static void main(String[] args) {
		int a[][] = { { 2, 5, 7, 3 }, { 8, 4, 2, 1 }, { 4, 6, 9, 5 }, { 2, 2, 2, 5 } };

		// Print the right diagonal using a while-loop
		printRightDiagonal(a);

		// Print the right diagonal using a for-loop
		printRightDiagonal2(a);
	}

	/**
	 * Prints the right diagonal (secondary diagonal) elements of a square 2D matrix
	 * using a while-loop.
	 *
	 * @param a the 2D square matrix from which the diagonal is extracted.
	 */
	public static void printRightDiagonal(int[][] a) {
		int i = 0;
		int j = a.length - 1;

		while (i < a.length && j >= 0) {
			System.out.println(a[i++][j--]);
		}
	}

	/**
	 * Prints the right diagonal (secondary diagonal) elements of a square 2D matrix
	 * using a for-loop.
	 *
	 * @param a the 2D square matrix from which the diagonal is extracted.
	 */
	public static void printRightDiagonal2(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][a.length - 1 - i]);
		}
	}
}
