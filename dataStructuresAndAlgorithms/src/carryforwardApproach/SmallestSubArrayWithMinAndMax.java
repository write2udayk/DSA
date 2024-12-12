package carryforwardApproach;

/**
 * Finds the smallest subarray containing both the minimum and maximum values
 * of an array.
 */
public class SmallestSubArrayWithMinAndMax {

    /**
     * Main method to execute the smallest subarray length calculation.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 1, 5, 6 };

        int smallest = smallestSubarrayLength(arr);

        System.out.println("Smallest subarray length : " + smallest);
    }

    /**
     * Calculates the smallest subarray length containing both the minimum and
     * maximum values of the array.
     *
     * @param arr the input array of integers.
     * @return the length of the smallest subarray containing both values.
     */
    public static int smallestSubarrayLength(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int minIndex = -1;
        int maxIndex = -1;
        int ans = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                if (minIndex != -1) {
                    ans = Math.min(ans, i - minIndex + 1);
                }
                maxIndex = i;
            } else if (arr[i] == min) {
                if (maxIndex != -1) {
                    ans = Math.min(ans, i - maxIndex + 1);
                }
                minIndex = i;
            }

        }

        return ans;
    }
}
