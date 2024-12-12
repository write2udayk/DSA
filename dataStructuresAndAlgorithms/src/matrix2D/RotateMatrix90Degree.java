package matrix2D;

/**
 * This class provides functionality to rotate a square matrix by 90 degrees
 * clockwise in place.
 */
public class RotateMatrix90Degree {
    
    /**
     * Main method to test the rotation of a matrix. It prints the matrix before
     * and after rotation.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int arr[][] = { { 2, 8, 5, 3 }, { 12, 6, 19, 4 }, { 1, 4, 9, 22 },
                        { 3, 32, 15, 18 } };
        TransposeMatrix.printArray(arr);
        rotate90Degree(arr);
        TransposeMatrix.printArray(arr);
    }

    /**
     * Rotates the given square matrix by 90 degrees clockwise in place. The matrix
     * must be square (i.e., number of rows == number of columns).
     *
     * @param a The square matrix to be rotated.
     * @throws IllegalArgumentException If the matrix is not square.
     */
    public static void rotate90Degree(int[][] a) {
        if (a.length != a[0].length) {
            throw new IllegalArgumentException("Matrix must be square to rotate 90 degree place.");
        }

        // Step 1: Transpose the matrix
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int[] arr : a) {
            int i = 0, j = arr.length - 1;
            while (i < j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
    }
}
