package matrix2D;

import java.util.Arrays;

/**
 * A utility class for matrix operations, including transposing a matrix.
 */
public class TransposeMatrix {

    /**
     * The main method to demonstrate the transpose operation on a 2D matrix.
     *
     * @param args the command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int a[][] = {
            { 2, 5, 7, 3 },
            { 8, 4, 2, 1 },
            { 4, 6, 9, 5 },
            { 2, 2, 2, 5 }
        };

        printArray(a);

        Transpose(a);

        // Print the transposed matrix
        printArray(a);
    }

    /**
     * Prints the contents of a 2D matrix in a row-by-row format.
     *
     * @param a the 2D matrix to print
     */
    public static void printArray(int[][] a) {
        for (int[] obj : a) {
            System.out.println(Arrays.toString(obj));
        }
        System.out.println();
    }

    /**
     * Transposes the given 2D matrix. This operation swaps rows with columns.
     *
     * @param a the 2D matrix to be transposed; the result is stored back 
     * in the same matrix
     */
    public static void Transpose(int[][] a) {
        int b[][] = new int[a.length][a[0].length];

        // Perform the transpose operation by swapping rows and columns
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[j][i];
            }
        }

        // Copy the transposed matrix back to the original matrix
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
} 
