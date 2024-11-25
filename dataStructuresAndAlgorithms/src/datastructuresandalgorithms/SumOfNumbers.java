package datastructuresandalgorithms;

import java.util.Scanner;

/**
 * A program to calculate the sum of numbers in a given range or up to a
 * specified number.
 */
public class SumOfNumbers {

    /**
     * The main method prompts the user for a start and end value, calculates the
     * sum of numbers in the range, and displays the results.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("To find the sum of numbers in a range:");
        System.out.println("Enter a start value:");
        int start = s.nextInt();
        System.out.println("Enter an end value:");
        int end = s.nextInt();

        int sumofNumbers = calculateSumOfStartToEnd(start, end);
        System.out.println("Sum of numbers in the range: " + sumofNumbers);

        System.out.println("Sum of numbers up to " + start + ": " +
                calculateSum(start, end));
        
        s.close();
    }

    /**
     * Calculates the sum of all numbers from 1 to the specified number.
     *
     * Formula: Sum = n * (n + 1) / 2
     *
     * Time Complexity: O(1) - Uses a direct mathematical formula.
     * Space Complexity: O(1) - No additional data structures are used.
     *
     * @param n the number up to which the sum is calculated
     * @return the sum of all numbers from 1 to n
     */
    public static int calculateSum(int start, int end) {
        return start * (start + 1) / 2;
    }

    /**
     * Calculates the sum of numbers between the specified start and end values,
     * inclusive.
     *
     * Formula: Sum(start to end) = Sum(1 to end) - Sum(1 to start-1)
     *
     * Time Complexity: O(1) - Uses a direct mathematical formula.
     * Space Complexity: O(1) - No additional data structures are used.
     *
     * @param start the starting value of the range
     * @param end the ending value of the range
     * @return the sum of numbers between start and end, inclusive
     */
    public static int calculateSumOfStartToEnd(int start, int end) {
        int sumEnd = (end * (end + 1)) / 2;
        int sumStart = ((start - 1) * start) / 2;

        // Sum from start to end is sumEnd - sumStart
        return sumEnd - sumStart;
    }
}
