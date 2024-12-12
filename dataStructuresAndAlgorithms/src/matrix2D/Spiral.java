package matrix2D;

public class Spiral {
    /**
     * Main method to initialize a 6x6 matrix and call the traverseSpiralOrder 
     * method to print the elements in spiral order.
     *
     * Time Complexity (TC): O(n^2)
     * Space Complexity (SC): O(1)
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[][] a = {
            { 1, 2, 3, 4, 5, 6 },
            { 7, 8, 9, 10, 11, 12 },
            { 13, 14, 15, 16, 17, 18 },
            { 19, 20, 21, 22, 23, 24 },
            { 25, 26, 27, 28, 29, 30 },
            { 31, 32, 33, 34, 35, 36 }
        };

        traverseSpiralOrder(a);
    }

    /**
     * Traverses and prints the elements of the given square matrix in spiral order.
     * The matrix is traversed from the outermost layer towards the center.
     *
     * @param a the square matrix to traverse
     */
    public static void traverseSpiralOrder(int[][] a) {
        int n = a.length;
        int i = 0, j = 0;

        while (n > 1) {
            for (int m = 1; m <= 4; m++) {
                for (int k = 0; k < n - 1; k++) {
                    System.out.println(a[i][j]);
                    if (m == 1) {
                        j++;
                    } else if (m == 2) {
                        i++;
                    } else if (m == 3) {
                        j--;
                    } else {
                        i--;
                    }
                }
            }

            n -= 2;
            i++;
            j++;

            if (n == 1) {
                System.out.println(a[i][j]);
            }
        }
    }
}
