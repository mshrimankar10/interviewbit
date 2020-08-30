package array;

/**
 * 
 * Given an array of real numbers greater than zero in form of strings.
 * Find if there exists a triplet (a,b,c) such that 1 < a+b+c < 2 .
 * Return 1 for true or 0 for false.
 * 
 */

import java.util.ArrayList;

public class TripletsWithSumBetweenGivenRange {

	public static int solve(ArrayList<String> A) {
		double a = Double.parseDouble(A.get(0));
		double b = Double.parseDouble(A.get(1));
		double c = Double.parseDouble(A.get(2));

		for (int i = 3; i < A.size(); i++) {
			if (a + b + c > 1.0 && a + b + c < 2.0) { // if sum of them is satisfying the condition
				return 1;
			} else if (a + b + c > 2.0) { // if sum is greater than 2 then replace the max value
				double x = Math.max(a, Math.max(b, c));

				if (x == a) {
					a = Double.parseDouble(A.get(i));
				} else if (x == b) {
					b = Double.parseDouble(A.get(i));
				} else {
					c = Double.parseDouble(A.get(i));
				}
			} else if (a + b + c < 1.0) { // if sum is less than 1 then replace the min value
				double x = Math.min(a, Math.min(b, c));
				if (x == a) {
					a = Double.parseDouble(A.get(i));
				} else if (x == b) {
					b = Double.parseDouble(A.get(i));
				} else {
					c = Double.parseDouble(A.get(i));
				}
			}
		}

		if (a + b + c > 1.0 && a + b + c < 2.0) {
			return 1;
		}

		return 0;
	}
}
