package slidingwindow;

/**
 * Class to find the maximum sum of a subarray with a given length.
 */
public class MaxSubArraySumKLen {

    /**
     * Main method to test the maximum subarray sum calculation.
     * Time Complexity: O(n)
	 * Space Complexity: O(1)
     *
     * @param args Command-line arguments (not used).
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        int[] a = { -3, 4, 5, 7, 2, 1, 4, 3, 9 };
        int k = 5; 

        System.out.println("Maximum sum of subarray of length " + k +
                           " is : " + findMaxSubArrayKLen(a, k));
    }

    /**
     * Finds the maximum sum of a subarray with the specified length.
     *
     * @param a The input array of integers.
     * @param k The length of the subarray.
     * @return The maximum sum of a subarray of length k.
     * @throws Exception 
     * @throws IllegalArgumentException if k is greater than the array length.
     */
    public static int findMaxSubArrayKLen(int[] a, int k) throws Exception {
        int n = a.length;

        if (k > n) {
            throw new Exception(
                "Subarray length k cannot be greater than the array length.");
        }
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        int maxSum = sum;

        int l = 1, r = k;
        
        while (r < n) {
            sum = sum - a[l - 1] + a[r]; 
            maxSum = Math.max(sum, maxSum);
            l++;
            r++;
        }

        return maxSum;
    }
}
