/**
 * You are given a 1D integer array B containing A integers.
 * Count the number of ways to split all the elements of the array into 3 contiguous parts so that the sum of elements in each part is the same.
 * Such that : sum(B[1],..B[i]) = sum(B[i+1],...B[j]) = sum(B[j+1],...B[n])
 */

import java.util.ArrayList;

public class Partitions {

	public int solve(int A, ArrayList<Integer> B) {

		int[] pre = new int[B.size()];
		int[] cn = new int[B.size()];
		long total = 0;
		long sum = 0;
		int count = 0;

		// Total of all elements in Array
		for (int i = 0; i < B.size(); i++) {
			total += B.get(i);
		}

		// if total of all elements in Array is not divisible by three then it's not
		// possible
		if (total % 3 != 0) {
			return 0;
		}

		for (int i = 0; i < B.size(); i++) {
			sum += B.get(i);
			pre[B.size() - 1 - i] += i == 0 ? B.get(B.size() - 1) : pre[B.size() - i] + B.get(B.size() - 1 - i);
			if (sum == total / 3) {
				cn[i]++;
			}
			cn[i] += i == 0 ? 0 : cn[i - 1];
		}
		for (int i = B.size() - 1; i >= 2; i--) {
			if (pre[i] == total / 3) {
				count += cn[i - 2];
			}
		}
		return count;

	}
}
