package arrays;
/**
 *
 * ArrayAnalyzer provides methods to analyze arrays, such as counting
 * elements with at least one other element greater in the array.
 */
public class ArrayAnalyzer {

    /**
     * The main method demonstrates the usage of the
     * atLeastOneElementGreater method with a sample array.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int array[] = { 2, 10, 7, 3, 10, 3, 10, 9, 4, 7, 10 };
        System.out.println(atLeastOneElementGreater(array));
    }

    /**
     * Counts the elements in the array with at least one element
     * greater than themselves.
     *
     * @param array Array of integers to analyze.
     * @return Count of elements with at least one greater element.
     */
    public static int atLeastOneElementGreater(int[] array) {
        int max = Integer.MIN_VALUE; // Maximum value in the array
        int maxCount = 0; // Count of occurrences of the maximum value

        // Find the maximum value and count its occurrences
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxCount = 1;
            } else if (array[i] == max) {
                maxCount++;
            }
        }

        // Return count of elements with at least one greater element
        return array.length - maxCount;
    }
}
