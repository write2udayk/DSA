package matrix2D;

/**
 * A utility class for in-place transposition of a square matrix.
 */
public class TransposeMatrix2 {

    /**
     * The main method to demonstrate in-place matrix transposition.
     *
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int arr[][] = { 
            { 2, 8, 5, 3 }, 
            { 12, 6, 19, 4 }, 
            { 1, 4, 9, 22 }, 
            { 3, 32, 15, 18 } 
        };

        // Print the original matrix using an external method
        TransposeMatrix.printArray(arr);

        // Transpose the matrix in-place
        transposeInPlace(arr);

        // Print the transposed matrix using an external method
        TransposeMatrix.printArray(arr);
    }

    /**
     * Transposes a square matrix in-place by swapping rows with columns.
     *
     * @param a the 2D matrix to be transposed
     * @throws IllegalArgumentException if the matrix is not square
     */
    public static void transposeInPlace(int[][] a) {
        if (a.length != a[0].length) {
            throw new IllegalArgumentException("Matrix must be square to transpose in place.");
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
