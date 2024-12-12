package carryforwardApproach;

/**
 * A program to count the number of leader elements in an array using the 
 * carry-forward approach.
 * 
 * A leader element is greater than all elements to its right in the array.
 */
public class CountOfLeaderInArray {
    static int mC = Integer.MIN_VALUE;

    /**
     * The entry point of the program. Calculates and prints the count of
     * leader elements in the input array.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int arr[] = { 15, -2, 4, 7, 9, 5, 3, 2 };
        System.out.println(getcountOfLeaderElement(arr));
    }

    /**
     * Counts the number of leader elements in the given array.
     * 
     * @param arr the input array
     * @return the count of leader elements
     * 
     * Time complexity: O(n), where n is the length of the array.
     * Space complexity: O(1), as no extra space is used apart from variables.
     */
    public static int getcountOfLeaderElement(int[] arr) {
        int lC = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > mC) {
                mC = arr[i];
                lC++;
            }
        }
        return lC;
    }
}
