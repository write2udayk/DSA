package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A utility class to rotate an array k times and print the result.
 */
public class RotateArrayKTimes {

	/**
	 * Main method to rotate an array by a specified number of positions.
	 * <p>
	 * Prompts the user for the number of positions to rotate the array. It rotates
	 * the array in place using the reversal algorithm and prints the rotated array.
	 * </p>
	 *
	 * @param args command-line arguments (not used in this implementation)
	 */
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner s = new Scanner(System.in);
		System.out.println("Enter k value!");
		int k = s.nextInt();
		rotateArrayRigthToLeft(a, k);
		s.close();
		rotateArrayLeftToRigth(a, k);
	}

	public static void rotateArrayLeftToRigth(int[] a, int k) {
		int n=a.length;
		reverseArray(a, 0,n-1);
	}

	/**
	 * Rotates the given array to the right by k positions.
	 * <p>
	 * The method rotates the array by reversing three segments: the entire array,
	 * the first k elements, and the remaining elements.
	 * </p>
	 *
	 * @param a the array to be rotated
	 * @param k the number of positions to rotate
	 */
	public static void rotateArrayRigthToLeft(int[] a, int k) {
		int n=a.length;
		k = k % a.length; // Ensure k is within array bounds
		reverseArray(a, 0,n-1);
		reverseArray(a, 0, k - 1);
		reverseArray(a, k, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	/**
	 * Reverses a segment of an array in place.
	 * <p>
	 * The method swaps elements from the start and end of the specified range
	 * moving toward the center until the segment is reversed.
	 * </p>
	 *
	 * @param a     the array containing the segment to reverse
	 * @param start the starting index of the segment
	 * @param end   the ending index of the segment
	 */
	public static void reverseArray(int[] a, int start, int end) {
		while (start < end) {
			a[start] = a[start] + a[end];
			a[end] = a[start] - a[end];
			a[start] = a[start] - a[end];
			start++;
			end--;
		}
	}
}
