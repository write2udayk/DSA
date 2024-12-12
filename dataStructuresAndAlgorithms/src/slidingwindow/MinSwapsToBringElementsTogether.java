package slidingwindow;

/**
 * A utility class to calculate the minimum number of swaps required
 * to bring all elements <= B together in a given array.
 */
public class MinSwapsToBringElementsTogether {

    /**
     * Main method to demonstrate the functionality.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = { 1, 12, 10, 14, 3, 10, 5 };
        int B = 8;
        System.out.println("Minimum swaps required: " + minSwaps(arr, B)); 
    }

    /**
     * Calculates the minimum number of swaps required to bring all 
     * elements <= B together.
     * @param arr the input array
     * @param b the threshold value
     * @return the minimum number of swaps required
     */
    public static int minSwaps(int[] arr, int b) {
        int n = arr.length;
        int countK = 0;

        // Count elements <= B
        for (int a : arr) {
            if (a <= b)
                countK++;
        }

        // Count "green" elements in the initial window
        int green = 0;
        for (int i = 0; i < countK; i++) {
            if (arr[i] <= b) {
                green++;
            }
        }

        // Calculate the initial answer
        int ans = countK - green;

        // Slide the window across the array
        int l = 1, r = countK;
        while (r < n) {
            if (arr[l - 1] <= b)
                green--;
            if (arr[r] <= b)
                green++;
            ans = Math.min(ans, countK - green);
            l++;
            r++;
        }

        return ans;
    }
}
