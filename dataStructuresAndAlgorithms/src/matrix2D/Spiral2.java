package matrix2D;

public class Spiral2 {
	public static void main(String[] args) {
		int[][] a = { 	{ 1, 2, 3, 4, 5, 6 }, 
						{ 7, 8, 9, 10, 11, 12 },
						{ 13, 14, 15, 16, 17, 18 },
						{ 19, 20, 21, 22, 23, 24 }, 
						{ 25, 26, 27, 28, 29, 30 },
						{ 31, 32, 33, 34, 35, 36 } };

		int n = a.length;
		int i = 0;
		int j = 0;
		while (n > 1) {
			for (int k = 0; k < n - 1; k++) {
				System.out.println(a[i][j]);
				j++;
			}
			for (int k = 0; k < n - 1; k++) {
				System.out.println(a[i][j]);
				i++;
			}
			for (int k = 0; k < n - 1; k++) {
				System.out.println(a[i][j]);
				j--;
			}
			for (int k = 0; k < n - 1; k++) {
				System.out.println(a[i][j]);
				i--;
			}

			i++;
			j++;
			n = n - 2;
			
			if(n==1) {
				System.out.println(a[i][j]);
			}
		}

	}

}
