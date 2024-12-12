package subarray;

/**
 * The MaxSubArraySumKLen class provides a method to calculate the maximum sum
 * of any subarray of a specified length in a given array using a prefix sum
 * technique. This approach ensures efficient computation of subarray sums.
 */
public class MaxSubArraySumKLen {
    public static void main(String[] args) {
        int a[] = { -3, 4, 5, 7, 2, 1, 4, 3, 9 };
        int k = 4;

        // Create the prefix sum array
        int ps[] = new int[a.length];
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }

        // Find and print the maximum sum of subarray of length k
        System.out.println(findMaxSubArraySumKLen(ps, k));
    }

    /**
     * Finds the maximum sum of any subarray of length k.
     * 
     * @param ps The prefix sum array.
     * @param k  The length of the subarray.
     * @return The maximum sum of a subarray of length k.
     * @throws IllegalArgumentException if k is greater than the array length.
     */
    public static int findMaxSubArraySumKLen(int[] ps, int k) {
        int n = ps.length;
        if (k > n) {
            throw new IllegalArgumentException("Subarray length k cannot be"
            		+ " greater than array length.");
        }

        int l = 0;
        int r = k - 1;
        int maxSum = Integer.MIN_VALUE;

        while (r < n) {
            int currentSum = l == 0 ? ps[r] : ps[r] - ps[l - 1];
            maxSum = Math.max(maxSum, currentSum);
            l++;
            r++;
        }

        return maxSum;
    }
}
