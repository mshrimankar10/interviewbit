/**
 * Find the contiguous subarray within an array, A of length N which has the largest sum.
 */

import java.util.List;

public class MaxSumContiguousSubarray {

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int maxSubArray(final List<Integer> A) {

		int maxSum = A.get(0);
		int currentMax = A.get(0);
		for (int i = 1; i < A.size(); i++) {

			currentMax = Math.max(A.get(i), A.get(i) + currentMax);

			maxSum = Math.max(currentMax, maxSum);
		}
		return maxSum;

	}
}
