package subarray;

/**
 * The PrintSubArray class provides a method to print all possible subarrays
 * of a static integer array.
 */
public class PrintSubArray {
    static int arr[] = {1, 2, 3, 4, 5};

    /**
     * Main method to iterate over all possible subarrays of the array
     * and print each subarray.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                printSubArray(i, j);
            }
        }
    }

    /**
     * Prints the elements of a subarray from index {@code l} to index {@code r},
     * inclusive, separated by commas.
     *
     * @param l the starting index of the subarray
     * @param r the ending index of the subarray
     */
    public static void printSubArray(int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i]);
            if (i < r) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
