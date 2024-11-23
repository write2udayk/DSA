package arrays;

import java.util.Scanner;

/**
 * This class contains a program that finds a pair of numbers in an array whose
 * sum equals a target value (k).
 */
public class SumOfPair {

	/**
	 * The main method is the entry point of the program. It prompts the user to
	 * input the length of the array, the array elements, and the target sum (k). It
	 * then checks if there is a pair of elements whose sum equals k.
	 *
	 * @param args Command line arguments (not used).
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter length of array: ");
		int len = s.nextInt();
		int arr[] = new int[len];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value at index " + i + ":");
			arr[i] = s.nextInt();
		}

		System.out.println("Enter a k value to find sum of pair: ");
		int k = s.nextInt();

		boolean result = sumOfPair(arr, k);

		if (!result) {
			System.out.println("No pairs found with the sum " + k);
		}

		s.close();
	}

	/**
	 * This method checks if there are any two elements in the array whose sum
	 * equals k. It prints the indexes of the pair if found and returns true,
	 * otherwise returns false.
	 *
	 * @param arr The array of integers.
	 * @param k   The target sum to find in the array.
	 * @return true if a pair is found, false otherwise.
	 */
	public static boolean sumOfPair(int[] arr, int k) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] + arr[i] == k) {
					System.out.println("Pair found at indexes: " + j + " and " + i);
					return true;
				}
			}
		}

		return false;
	}
}
