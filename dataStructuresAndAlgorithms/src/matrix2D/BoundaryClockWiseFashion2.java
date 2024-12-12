package matrix2D;

/**
 * Demonstrates traversing the boundary of a square matrix in a clockwise fashion
 * using a loop for each boundary side.
 */
public class BoundaryClockWiseFashion2 {
    public static void main(String[] args) {
        int[][] a = {
            { 1, 2, 3, 4, 5, 6 },
            { 7, 8, 9, 10, 11, 12 },
            { 13, 14, 15, 16, 17, 18 },
            { 19, 20, 21, 22, 23, 24 },
            { 25, 26, 27, 28, 29, 30 },
            { 31, 32, 33, 34, 35, 36 }
        };

        traverseBoundaryClockwise(a);
    }

    /**
     * Traverses and prints the boundary elements of a square matrix in a clockwise
     * fashion.
     *
     * @param a the square matrix to traverse
     * @throws IllegalArgumentException if the input matrix is not square
     */
    public static void traverseBoundaryClockwise(int[][] a) {
        if (a.length != a[0].length) {
            throw new IllegalArgumentException("Matrix must be square.");
        }

        int n = 1;
        int i = 0, j = 0;
        while (n <= 4) {
            for (int k = 1; k <= a.length - 1; k++) {
                System.out.println(a[i][j]);
                if (n == 1) {
                    j++;
                } else if (n == 2) {
                    i++;
                } else if (n == 3) {
                    j--;
                } else {
                    i--;
                }
            }
            n++;
        }
    }
}
