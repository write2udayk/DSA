package arrays;

/**
 * Finds the number of equilibrium indices in an array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class EquilibriumIndex {

    static int ps[];

    public static void main(String[] args) {
        int a[] = { 3, 0, -2, 2, 0, 3 };
        ps = new int[a.length];
        int result = findEquilibriumIndex(a);
        System.out.println("Number of equilibrium index's: " + result);
    }

    /**
     * Calculates the number of equilibrium indices in the given array.
     * 
     * @param a the input array
     * @return the count of equilibrium indices
     */
    public static int findEquilibriumIndex(int[] a) {
        if (a.length == 0)
            return 0;

        prefixSum(a);
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            int leftSum = (i == 0) ? 0 : ps[i - 1];
            int rightSum = ps[a.length - 1] - ps[i];
            if (leftSum == rightSum) {
                count++;
            }
        }

        return count;
    }

    /**
     * Computes the prefix sum of the given array.
     * 
     * @param a the input array
     */
    public static void prefixSum(int[] a) {
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }
    }
}
