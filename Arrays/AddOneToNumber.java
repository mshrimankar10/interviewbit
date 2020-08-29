/**
 * 
 * Given a non-negative number represented as an array of digits,
 * add 1 to the number ( increment the number represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 */

import java.util.ArrayList;

public class AddOneToNumber {

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

		// Truncate zeros if they are present in most significant digit
		int n = A.size();
		for (int i = 0; i < n; i++) {
			if (n == 1) {
				break;
			}
			if (A.get(i) > 0) {
				break;
			} else {
				A.remove(i);
				i--;
				n--;
			}
		}
		ArrayList<Integer> output = new ArrayList<>();
		ArrayList<Integer> reverse = new ArrayList<>();

		// Add one in the least significant digit and forward the carry
		int num = A.get(n - 1) + 1;
		int carry = num / 10;
		output.add(num % 10);
		for (int i = n - 2; i >= 0; i--) {
			num = A.get(i) + carry;
			carry = num / 10;
			output.add(num % 10);
		}
		if (carry > 0) {
			output.add(carry);
		}

		// Reverse the whole array so that the most significant digit is at the head of
		// the list.
		for (int i = 0; i < output.size(); i++) {
			reverse.add(output.get(output.size() - i - 1));
		}
		return reverse;
	}

}
