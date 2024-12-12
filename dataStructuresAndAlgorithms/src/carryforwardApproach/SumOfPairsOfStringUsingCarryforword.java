package carryforwardApproach;

/**
 * A program to calculate the number of "ag" pairs in a given string using
 * a carry-forward approach.
 */
public class SumOfPairsOfStringUsingCarryforword {

    /**
     * The entry point of the program. Computes and prints the number of "ag"
     * pairs in the input string.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String a = "agdgfrgaag";
        int result = getCountOfpairs(a);
        System.out.println("Number of ag pairs are :" + result);
    }

    /**
     * Calculates the number of "ag" pairs in the given string.
     * 
     * @param a the input string
     * @return the count of "ag" pairs
     * 
     * Time complexity: O(n), where n is the length of the string.
     * Space complexity: O(1), as no extra space is used apart from variables.
     */
    public static int getCountOfpairs(String a) {
        a = a.toLowerCase();
        char[] arr = a.toCharArray();
        int cg = 0;
        int answer = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'g') {
                cg++;
            } else if (arr[i] == 'a') {
                answer += cg;
            }
        }

        return answer;
    }
}
