package datastructuresandalgorithms;

/**
 * The PrimeChecker class provides functionality to determine whether a given
 * number is a prime number. A prime number has exactly two distinct divisors: 1
 * and the number itself.
 */
public class PrimeNumber {

	/**
	 * The main method tests whether a number is prime by calling the countDivisors
	 * method and prints the result.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		double number = 25;
		boolean isPrime = countDivisors(number);
		System.out.println("Is the number prime? " + isPrime);
	}

	/**
	 * Determines if a given number is prime by counting its divisors.
	 *
	 * Time Complexity: 
	 * - Iterates up to the square root of the number: O(sqrt(n)).
	 *
	 * Space Complexity: 
	 * - Uses a constant amount of space: O(1).
	 *
	 * @param number the number to check for primality
	 * @return true if the number is prime, false otherwise
	 */
	public static boolean countDivisors(double number) {
		int count = 0;
		double sqrt = Math.sqrt(number);

		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) {
				if (i != number / i) {
					count += 2; // Count both divisors
				} else {
					count += 1; // Count once for perfect square
				}
			}
		}

		return count == 2; // A prime number has exactly 2 divisors
	}

}
