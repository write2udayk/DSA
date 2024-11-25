package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computes the prefix sum of an array and efficiently answers range sum queries.
 */
public class PrefixSumArrayKQuery {
    static int ps[];
    static Scanner s = new Scanner(System.in);

    /**
     * Initializes the array, computes the prefix sum, and processes user queries.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 6, 7, 11 };
        ps = new int[a.length];
        prefixSum(a);

        System.out.println(Arrays.toString(ps));

        System.out.println("Enter number of Query's");
        int r = s.nextInt();
        getQuerySum(r);
    }

    /**
     * Processes multiple range sum queries from the user.
     * 
     * Time Complexity: O(r), where r is the number of queries.
     * Space Complexity: O(1).
     * 
     * @param r the number of queries to process
     */
    public static void getQuerySum(int r) {
        for (int i = 0; i < r; i++) {
            System.out.print("Enter a query :" + (i + 1) + " left index value : ");
            int left = s.nextInt();
            System.out.print("Enter a query :" + (i + 1) + " rigth index value: ");
            int right = s.nextInt();

            if (left >= 0 && right < ps.length) {
                if (left == 0) {
                    System.out.println((i + 1) + "query Sum : " + ps[right]);
                } else {
                    System.out.println((i + 1) + "query Sum : " 
                        + (ps[right] - ps[left - 1]));
                }
            } else {
                System.out.println("Indices out of bounds. Please enter values"
                        + " between 0 and " + (ps.length - 1));
            }
            System.out.println();
        }
    }

    /**
     * Computes the prefix sum array for a given input array.
     * 
     * Time Complexity: O(n), where n is the size of the input array.
     * Space Complexity: O(1) (ignoring input and prefix sum array storage).
     * 
     * @param a the input array for which the prefix sum is computed
     */
    private static void prefixSum(int[] a) {
        ps[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            ps[i] = ps[i - 1] + a[i];
        }
    }
}
