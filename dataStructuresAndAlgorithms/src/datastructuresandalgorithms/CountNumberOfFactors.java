package datastructuresandalgorithms;

import java.util.Scanner;

/**
 * The CountNumberOfFactors class provides functionality to find and count the
 * number of factors for a given number. A factor of a number is any integer
 * that divides the number without leaving a remainder.
 */
public class CountNumberOfFactors {
    /**
     * The main method which prompts the user to enter a number, then calculates and
     * displays the total count of factors of that number.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value to find numbers of factors:");
        double number = s.nextDouble();

        int divisorCount = countDivisors(number);
        System.out.println("Total number of factors: " + divisorCount);
    }

    /**
     * Counts the number of factors of a given number by iterating from 1 to the
     * square root of the number. For each divisor found, it calculates its pair
     * divisor and increments the count.
     *
     * Time Complexity:
     * - Iterates up to the square root of the number: O(sqrt(n)).
     *
     * Space Complexity:
     * - Uses a constant amount of extra space: O(1).
     *
     * @param number the number whose factors are to be counted
     * @return the total number of factors of the number
     */
    public static int countDivisors(double number) {
        int count = 0;
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of the number: " + sqrt);

        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                if (i != number / i) {
                    count += 2; // count both i and number / i
                } else {
                    count += 1; // count only once if i is the square root
                }
            }
        }

        return count;
    }
}
