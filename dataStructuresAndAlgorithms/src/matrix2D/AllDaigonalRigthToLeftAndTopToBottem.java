package matrix2D;

/**
 * This class prints all diagonals of a 2D matrix from right to left 
 * and top to bottom.
 * 
 * Time Complexity: O(nm), where n is the matrix dimension
 * Space Complexity: O(1) as no extra space is used
 */
public class AllDaigonalRigthToLeftAndTopToBottem {
    
    /**
     * Main method to demonstrate diagonal printing of a 2D matrix.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[][] arr = { 
            { 2, 8, 5, 3 },
            { 12, 6, 19, 4 },
            { 1, 4, 9, 22 },
            { 3, 32, 15, 18 } 
        };

        printAllDaigonal(arr);
    }

    /**
     * Prints all diagonals of the matrix from right to left and top to bottom.
     * 
     * First loop prints diagonals starting from top row
     * Second loop prints diagonals starting from last column
     * 
     * @param arr 2D integer matrix to print diagonals from
     */
    public static void printAllDaigonal(int[][] arr) {
        int n = arr.length;
        
        // Print diagonals starting from top row
        for (int col = 0; col < n; col++) {
            int i = 0, j = col;
            while (i < n && j >= 0) {
                System.out.print(arr[i++][j--] + ", ");
            }
            System.out.println();
        }
        
        // Print diagonals starting from last column
        int m = arr[0].length;
        for (int row = 1; row < arr.length; row++) {
            int i = row, j = m - 1;
            while (i < n && j >= 0) {
                System.out.print(arr[i++][j--] + ", ");
            }
            System.out.println();
        }
    }
}