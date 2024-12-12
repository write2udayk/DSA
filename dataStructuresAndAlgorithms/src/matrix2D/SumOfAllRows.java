package matrix2D;

/**
 * Calculates and displays the sum of elements in each row of a 2D array.
 */
public class SumOfAllRows {

    /**
     * The entry point of the program.
     * <p>
     * Initializes a 2D array and computes the sum of elements in each row.
     * Each row's sum is printed to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a[][] = { { 2, 5, 7 }, { 8, 4, 2 }, { 4, 6, 9 }, { 2, 2, 2 } };
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
            System.out.println(sum);
        }
    }
}
