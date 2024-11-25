package arrays;

import java.util.Arrays;

/**
 * A utility class to demonstrate in-place reversal of an array.
 */
public class ArrayReversal {

    /**
     * Main method to execute the array reversal example.
     * <p>
     * This method reverses the elements of an integer array in place and prints
     * the result.
     * </p>
     *
     * <p>
     * Time Complexity: O(n), where n is the number of elements in the array.
     * Space Complexity: O(1), as the operation is performed in place.
     * </p>
     *
     * @param args command-line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}
