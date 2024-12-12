package subarray;

import java.util.Arrays;

public class PrintSumOfAllSubArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int pS[] = prefixSum(arr);
		//System.out.println(Arrays.toString(pS));

		for (int l = 0; l < pS.length; l++) {
			for (int r = l; r < pS.length; r++) {
				if (l == 0) {
					System.out.println(pS[r]);
				} else {
					System.out.println(pS[r] - pS[l - 1]);
				}
			}
		}
	}

	public static int[] prefixSum(int[] arr) {
		int pS[] = new int[arr.length];
		pS[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			pS[i] = pS[i - 1] + arr[i];
		}
		return pS;
	}

}
