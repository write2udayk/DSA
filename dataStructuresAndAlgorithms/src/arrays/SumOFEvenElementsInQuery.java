package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A utility class to calculate the prefix sum of even elements in an array
 * and handle sum queries for specific ranges.
 */
public class SumOFEvenElementsInQuery {
    static int ps[];
    static Scanner s = new Scanner(System.in);

    /**
     * The entry point of the program. Initializes the array, calculates the 
     * prefix sum of even elements, and processes user queries.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 5, 7, 15, 12, 8, 9, 11 };
        ps = new int[arr.length];
        PrefixSumOfEvenElements(arr);
        System.out.println(Arrays.toString(ps));
        System.out.println("Enter a number of Querys!");
        int r = s.nextInt();
        getQuerySum(r);
    }

    /**
     * Computes the prefix sum array for even elements in the input array.
     * 
     * @param arr the input array
     */
    public static void PrefixSumOfEvenElements(int[] arr) {
        ps[0] = (arr[0] % 2 == 0 ? arr[0] : 0);

        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + (arr[i] % 2 == 0 ? arr[i] : 0);
        }
    }

    /**
     * Handles user queries to calculate the sum of even elements between
     * specified indices using the prefix sum array.
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
}
