package datastructuresandalgorithms;

public class SquareRootFinder {

	public static void main(String[] args) {
		int number = 25;
		int result = squareroot(number);
		if (result != -1) {
			System.out.println("The square root of " + number + " is: " + result);
		} else {
			System.out.println(number + " is not a perfect square.");
		}
	}

	/**
	 * Finds the square root of a given number if it is a perfect square.
	 *
	 * @param n the number to find the square root of
	 * @return the square root of n if it is a perfect square, otherwise -1
	 */
	public static int squareroot(int n) {
		for (int i = 1; i <= n; i++) {
			if (i * i == n) {
				return i; 
			}
		}
		return -1; 
	}
}
