package matrix2D;

/**
 * Finds and displays the maximum sum among all columns of a 2D array.
 */
public class MaxColunmSum {

	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes a 2D array and computes the sum of elements in each column. The
	 * maximum column sum is calculated and displayed.
	 *
	 * <p>
	 * Time Complexity: O(m * n), where m is the number of columns and n is the
	 * number of rows. Space Complexity: O(1), as only a constant amount of extra
	 * space is used.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		int arr[][] = { { 2, 8, 5, 3 }, { 12, 6, 19, 4 },
						{ 1, 4, 9, 22 }, { 3, 32, 15, 18 } };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
}
