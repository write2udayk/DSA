package matrix2D;

/**
 * A utility class to print the left diagonal (main diagonal) elements
 * of a square 2D matrix.
 */
public class LeftDiagonal {

    /**
     * The main method demonstrates how to extract and print the left
     * diagonal elements of a square 2D matrix.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        int a[][] = { 
            { 2, 5, 7, 3 }, 
            { 8, 4, 2, 1 }, 
            { 4, 6, 9, 5 }, 
            { 2, 2, 2, 5 } 
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][i]);
        }
    }
}
