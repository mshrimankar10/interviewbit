/**
 * 
 * Given an integer array A, 
 * find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

	public static int solve(ArrayList<Integer> A) {
		Collections.sort(A);
		if (A.size() > 1) {
			if (A.get(0) == A.size() - 1 && A.get(0) != A.get(1)) { // Checking the first element
				return 1;
			} else if (A.get(A.size() - 1) == 0) { // Checking the last element
				return 1;
			} else {
				int i = 1;
				while (i < A.size() - 1) {
					if (A.get(i) == (A.size() - i - 1) && A.get(i) != A.get(i + 1)) {
						return 1;
					}
					i++;
				}
			}
		} else if (A.get(0) == 0) {
			return 1;
		}
		return -1;
	}

}
