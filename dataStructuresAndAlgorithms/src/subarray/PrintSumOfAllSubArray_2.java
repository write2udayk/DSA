package subarray;

public class PrintSumOfAllSubArray_2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		printSumOfSubArray(arr);
	}

	public static void printSumOfSubArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}

}
