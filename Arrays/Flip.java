/**
 * 
 * You are given a binary string(i.e. with characters 0 and 1) S consisting of
 * characters S1, S2, …, SN. In a single operation, you can choose two indices L
 * and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By
 * flipping, we mean change character 0 to 1 and vice-versa.
 * 
 * Your aim is to perform ATMOST one operation such that in final string number
 * of 1s is maximised. If you don’t want to perform the operation, return an
 * empty array. Else, return an array consisting of two elements denoting L and
 * R. If there are multiple solutions, return the lexicographically smallest
 * pair of L and R.
 * 
 * Notes: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or,
 * if a == c and b < d.
 * 
 */

public class Flip {

	public int[] flip(String A) {

		if (A.length() == 0) {
			return new int[] {};
		}
		boolean zero = false;
		int gain[] = new int[A.length()];
		for (int i = 0; i < A.length(); i++) {
			gain[i] = (A.charAt(i) == '1') ? -1 : 1;
			if (A.charAt(i) == '0') {
				zero = true;
			}
		}

		// If all elements are 1 then no need to flip
		if (!zero) {
			return new int[] {};
		}
		int l = 0;
		int r = A.length() - 1;
		int maxSum = 0;
		int curSum = 0;
		int currL = 0;
		int currR = 0;

		for (int i = 0; i < gain.length; i++) {
			if (curSum + gain[i] >= 0) {
				curSum += gain[i];
				currR = i;
			} else {
				curSum = 0;
				currL = i + 1;
			}

			if (curSum > maxSum) {
				maxSum = curSum;
				l = currL;
				r = currR;
			}
		}
		return new int[] { l + 1, r + 1 };

	}
}
