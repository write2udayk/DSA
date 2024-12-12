package subarray;

public class MaxSubArraySum {
	public static void main(String[] args) {
		int arr[] = { 3, -7, 4, 2, -5, 7 };

		int result = getMaxOfSubbArray(arr);
		System.out.println(result);
	}

	public static int getMaxOfSubbArray(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}

}
