package matrix2D;

/**
 * Demonstrates traversing the boundary of a square matrix in a clockwise fashion.
 */
public class BoundaryClockWiseFashion {
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
     * Traverses and prints the boundary elements of a square matrix in a clockwise fashion.
     *
     * @param matrix the square matrix to traverse
     */
    public static void traverseBoundaryClockwise(int[][] matrix) {
        int n = matrix.length;
        int i = 0;
        int j = 0;

        for (int k = 1; k <= n - 1; k++) {
            System.out.println(matrix[i][j]);
            j++;
        }

        for (int k = 1; k <= n - 1; k++) {
            System.out.println(matrix[i][j]);
            i++;
        }

        for (int k = 1; k <= n - 1; k++) {
            System.out.println(matrix[i][j]);
            j--;
        }

        for (int k = 1; k <= n - 1; k++) {
            System.out.println(matrix[i][j]);
            i--;
        }
    }
}
