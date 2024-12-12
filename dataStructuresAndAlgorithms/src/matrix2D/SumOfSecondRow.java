package matrix2D;

public class SumOfSecondRow {

	public static void main(String[] args) {
		int a [][]= {{2,5,7},{8,4,2} ,{4,6,9},{2,2,2}};
		int sum=0;
		for (int i = 0; i < a[0].length; i++) {
				sum+=a[1][i];
		}
		System.out.println(sum);
	}
}